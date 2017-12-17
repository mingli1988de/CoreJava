import java.time.LocalDate;
import java.util.Random;

public class Employee extends Person {

	/* Field */
	private static int nextId;
	private int id;
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
	public Employee(double salary) {
		this("Employee #" + nextId, salary);
	}

	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
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

	@Override
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}

}
