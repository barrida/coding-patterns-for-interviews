package interviews;

import java.util.Random;

class Robot {
	private int id;
	private int position;
	private boolean parachuteSeen = false;
	private final boolean cannotSeeParachute; // Indicates if the robot will always fail to see the parachute
	private final long startTime; // Tracks the time when the robot was created

	public Robot(int id, boolean cannotSeeParachute) {
		this.id = id;
		this.position = new Random().nextInt(100); // Random starting position between 0-99
		this.cannotSeeParachute = cannotSeeParachute;
		this.startTime = System.currentTimeMillis();
	}

	public int getId() {
		return id;
	}

	public int getPosition() {
		return position;
	}

	public void moveRight() {
		position++;
	}

	public void moveLeft() {
		position--;
	}

	/**
	 * Simulates parachute detection. After 5 seconds, one robot is guaranteed to see the parachute.
	 */
	public void checkParachute() {
		if (!parachuteSeen && !cannotSeeParachute) {
			long elapsedTime = System.currentTimeMillis() - startTime;
			if (elapsedTime >= 5000) {
				parachuteSeen = true;
			}
		}
	}

	public boolean hasSeenParachute() {
		return parachuteSeen;
	}

	public void move() {
		if (parachuteSeen) {
			moveRight(); // Robot that has seen the parachute continues moving without checking
		} else {
			checkParachute();
			if (!parachuteSeen) {
				moveRight(); // If the parachute is not seen, keep moving right
			}
		}

		System.out.printf("Robot %s current position: %s%n", id, position);
	}
}

public class Main {
	public static void main(String[] args) {
		Robot robot1 = new Robot(1, false); // This robot will see the parachute after 5 seconds
		Robot robot2 = new Robot(2, true);  // This robot will never see the parachute

		System.out.printf("Robot %s starting position: %s%n", robot1.getId(), robot1.getPosition());
		System.out.printf("Robot %s starting position: %s%n", robot2.getId(), robot2.getPosition());

		// Robots continue moving until they meet
		while (robot1.getPosition() != robot2.getPosition()) {
			robot1.move();
			robot2.move();

			// Check convergence: If robots move in opposite directions, ensure they can meet
			if (robot1.getPosition() > robot2.getPosition() && !robot1.hasSeenParachute()) {
				robot2.moveRight(); // Robot 2 accelerates
			} else if (robot2.getPosition() > robot1.getPosition() && !robot2.hasSeenParachute()) {
				robot1.moveRight(); // Robot 1 accelerates
			}
		}

		System.out.printf("Robots meet at position %s: ", robot1.getPosition());
	}
}
