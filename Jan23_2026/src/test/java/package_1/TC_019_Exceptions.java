package package_1;

public class TC_019_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String str = null;
		str.equals("hello");
	}catch(Exception e) {
		System.out.println("Error: " + e);
		System.out.println("Error: " + e.getMessage());
	}
		
		System.out.println("After Error");

	}

}
