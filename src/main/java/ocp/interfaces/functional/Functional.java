package ocp.interfaces.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * @author suleyman.yildirim
 */
public class Functional {
	public static void main(String[] args) {
		Predicate<Employee> p = new Predicate<Employee>(){
			public boolean test(Employee e){
				return e.getSalary()>100000;
			}
		};

		ArrayList<Employee> employeeList= new ArrayList<>();
		employeeList.add(new Employee(120000));
		employeeList.add(new Employee(130000));
		employeeList.add(new Employee(90000));
		filterEmployees(employeeList, p);

		System.out.println(Arrays.toString(Arrays.stream(employeeList.toArray()).toArray()));

	}

	private static void filterEmployees(ArrayList<Employee> employees, Predicate<Employee> p){
		employees.removeIf(p::test);
	}
}
