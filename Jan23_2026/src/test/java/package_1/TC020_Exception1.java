package package_1;

public class TC020_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int d = 0;
		int a = 50/d;
		System.out.println(a);
		}catch(Exception e){
			System.out.println("Error: " + e);
		}finally {
			System.out.println("Finally executed");
		}
		
		System.out.println("Yoi java!");
	}

}
