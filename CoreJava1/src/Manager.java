import java.util.Objects;

public class Manager extends Employee {

	private double bonus;

	/**
	 * 
	 * @param name
	 * @param salary
	 * @param year
	 *            the hire year
	 * @param month
	 *            the hire month
	 * @param day
	 *            the hire day
	 */
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
	}

	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject))
			return false;
		Manager other = (Manager) otherObject;
		return bonus == other.bonus;
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), bonus);
	}

	public String toString() {
		return super.toString() + "[bonus=" + bonus + "]";
	}

}
