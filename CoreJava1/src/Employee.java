import java.time.LocalDate;
import java.util.Objects;
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

	public boolean equals(Object otherObject) {

		// a quick test to see if the objects are identical
		if (this == otherObject)
			return true;
		// must return false if the explicit parameter is null
		if (otherObject == null)
			return false;
		// if the class don't match, they can't be equal
		if (getClass() != otherObject.getClass())
			return false;

		// now we know otherObject is a non-null Employee
		Employee other = (Employee) otherObject;

		// test whether the fields have identical values
		return Objects.equals(this.getName(), other.getName()) && salary == other.salary
				&& Objects.equals(hireDay, other.hireDay);
	}

	public int hashCode() {
		return Objects.hash(getName(), salary, hireDay);
	}

	public String toString() {
		return getClass().getName() + "[name= " + getName() + ",salary= " + salary + ",hireDay= " + hireDay + "]";
	}
}
