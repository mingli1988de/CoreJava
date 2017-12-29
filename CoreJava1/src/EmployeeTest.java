import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {

		// fill the staff array with 3 Employee objects
		ArrayList<Employee> staff = new ArrayList<>();

		staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker", 50000, 1987, 11, 1));
		staff.add(new Employee("Tony Tester", 40000, 1987, 10, 15));
		staff.trimToSize();

		// raise everyone's salary by 5%
		for (Employee e : staff)
			e.raiseSalary(5);

		// print out information about all Employee objects
		for (Employee e : staff)
			System.out.println("ID=" + e.getId() + ",name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
					+ e.getHireDay());

		System.out.println("next ID is " + Employee.getNextId());

		Integer a = 100;
		Integer b = 100;
		System.out.println(a == b);

		System.out.println("the highest salary is "
				+ max(staff.get(0).getSalary(), staff.get(1).getSalary(), staff.get(2).getSalary()));

		staff.sort(null);

		// print out information about all Employee objects
		for (Employee e : staff)
			System.out.println("ID=" + e.getId() + ",name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
					+ e.getHireDay());

		Employee[] staffnew = new Employee[3];
		staffnew[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staffnew[1] = new Employee("Harry Hacker", 50000, 1987, 11, 1);
		staffnew[2] = new Employee("Tony Tester", 40000, 1987, 10, 15);

		Arrays.sort(staffnew);
		// print out information about all Employee objects
		for (Employee e : staffnew)
			System.out.println("ID=" + e.getId() + ",name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
					+ e.getHireDay());
	}

	private static double max(double... values) {

		double largest = Double.NEGATIVE_INFINITY;

		for (double v : values)
			if (v > largest)
				largest = v;

		return largest;
	}

}
