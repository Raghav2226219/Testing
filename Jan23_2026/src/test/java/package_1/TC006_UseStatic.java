package package_1;

public class TC006_UseStatic {
	
	static int intNum1 = 5;
	static int intNum2;
	
	static {
		System.out.println("Static block intialized");
		intNum2 = intNum1 * 4;
	}
	
	static void myMethod(int intNum3) {
		System.out.println("Number3: " + intNum3);
		System.out.println("Number1: " + intNum1);
		System.out.println("Number2: " + intNum2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod(50);
	}

}
