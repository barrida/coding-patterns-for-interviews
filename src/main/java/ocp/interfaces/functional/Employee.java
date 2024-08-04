package ocp.interfaces.functional;

/**
 * @author suleyman.yildirim
 */
public class Employee {
	private final int salary;

	public Employee(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}
}
