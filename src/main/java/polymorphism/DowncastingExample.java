package polymorphism;

class Animal {
	void makeSound() {
		System.out.println("Some sound");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("Woof!");
	}

	void fetch() {
		System.out.println("Fetching the ball");
	}
}

public class DowncastingExample {
	public static void main(String[] args) {
		// Animal animal = new Animal(); // throws java.lang.ClassCastException
		Animal animal = new Dog(); // Creating a Dog object and assigning it to an Animal reference

		// Attempting to downcast the Animal reference to a Dog reference
		Dog dog = (Dog) animal; // Explicit downcasting

		dog.makeSound(); // Calling overridden method from Dog class
		dog.fetch();     // Calling method specific to Dog class

		Animal animal2 = new Animal();
		animal2.makeSound();

	}
}

