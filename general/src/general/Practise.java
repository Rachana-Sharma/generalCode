package general;

public class Practise {

	private String name;
	private int age;
	private String gender;
	private int experience;
	
	

	/**
	 * @param name
	 * @param age
	 * @param gender
	 */
	public Practise(String name, int age, String gender, int experience) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.experience = experience;
	}

	/**
	 * 
	 */
	public Practise() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public int salaryGiven() {
		int salary=0;
		System.out.println("salary from base class: ");
		return salary;
	}
	
	
}
