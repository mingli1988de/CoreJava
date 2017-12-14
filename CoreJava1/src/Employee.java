import java.time.LocalDate;
import java.util.Random;

public class Employee {

	/* Field */
	private static int nextId;
	private int id;
	private String name = "";
	private double salary;
	private LocalDate hireDay;

	/* Static Initialization Field */
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}

	/* Object Initialization Field */
	{
		id = nextId;
		nextId++;
	}

	/* Constructor */
	public Employee() {
	}

	public Employee(double salary) {
		this("Employee #" + nextId, salary);
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	/* Method */
	public static int getNextId() {
		return nextId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	/* Unit test */
	public static void main(String[] args) {
		Employee e = new Employee("Test One", 50000, 1990, 1, 1);
		System.out.println(e.getId() + " " + e.getName());
	}

}
