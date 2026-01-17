package package_1;

public class TC021_MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String str = "Hello";
		int a = str.length();
		int  b = 42/a;
		
		int[] c = {1};
		c[42] = 99;
	}catch(ArithmeticException e) {
		System.out.println("Divide by zero: " + e);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array ndex out of bound: " + e);
	}finally {
		System.out.println("Code Ends");
	}
		
		System.out.println("After code");

	}

}
