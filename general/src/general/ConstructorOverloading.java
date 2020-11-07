package general;

public class ConstructorOverloading {

	private int num1;
	
	ConstructorOverloading(){
		num1=10;
	}
	
	ConstructorOverloading(int num2){
		this();
		num1=num1+num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading obj = new ConstructorOverloading(16);
		System.out.println(obj.num1);
	}

}
