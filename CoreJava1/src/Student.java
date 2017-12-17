
public class Student extends Person {

	private String major;

	/**
	 * 
	 * @param name
	 * @param major
	 */
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		return String.format("a student majoring in ", major);
	}

}
