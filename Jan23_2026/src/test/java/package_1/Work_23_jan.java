package package_1;

public class Work_23_jan {

	static void details() {
		System.out.println("Personal Details");
		System.out.println("First Name: John");
		System.out.println("Last Name: Doe");
		System.out.println("Gender: M");
		System.out.println("Age: 21");
		System.out.println("Weight: 78.8");
		}
	
	static void mat() {
		int a = 2;
		int b = 2;
		System.out.println("Addition" + ": " +(a + b));
		System.out.println("Subtraction" + ": " + (a - b));
		System.out.println("Multiply" + ": " + (a * b));
		System.out.println("Division" + ": " + (a / b));
		}
	
	static void age() {
		int age = 30;
		
		if( age>18 && age<100) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("Not eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// details();
		// mat();
		// age();
	}

}
