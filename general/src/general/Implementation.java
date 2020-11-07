package general;

import java.util.Scanner;

public class Implementation extends Practise {
	public static final int numberOfMonths = 12;
	private int a;
	private int b;
	private int num;

	/*
	 * override base class method
	 */
	public int salaryGiven() {
		int exp = 7;
		int salary = exp > 5 ? 40000 : 20000;
		System.out.println("salary from child class is : " + salary);
		return salary;
	}

	/*
	 * final method
	 */
	final int bonusGiven() {
		int bonus = 5000;
		System.out.println("Bonus from final method is: " + bonus);
		return bonus;
	}

	/*
	 * using static final variable in this method
	 */
	public static int staticFinalExample(Practise p) {
		int salary = p.getExperience() > 5 ? 40000 : 20000;
		int annualSalary = numberOfMonths * salary;
		System.out.println("annual salary from static final example is :" + annualSalary);
		return annualSalary;

	}

	/*
	 * using this keyword
	 */
	public int calculate(int c, int d) {

		this.a = c;
		this.b = d;
		int sum = c + d;
		System.out.println("sum using this  = " + sum);
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details.");
		System.out.println("Enter employee name :");
		String name = sc.nextLine();
		System.out.println("Enter employee age :");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee gender :");
		String gender = sc.nextLine();
		System.out.println("Enter employee experience :");
		int experience = sc.nextInt();
		Practise p1 = new Practise();
		p1.salaryGiven();

		Practise p2 = new Implementation();
		p2.salaryGiven();

		Implementation obj = new Implementation();
		obj.bonusGiven();
		obj.calculate(4, 6);

	}

}
