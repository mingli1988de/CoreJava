import java.util.Arrays;

public class ManagerTest {

	public static void main(String[] args) {

		// construct a manager object
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);

		Employee[] staff = new Employee[3];

		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

		// print out information about all Employee objects
		for (Employee e : staff)
			System.out.println("ID=" + e.getId() + ",name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
					+ e.getHireDay());
		
		Arrays.sort(staff);
		
		for (Employee e : staff)
			System.out.println("ID=" + e.getId() + ",name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
					+ e.getHireDay());
	}

}
