package package_1;

public class TC001_Variables {
	
	private static double width = 20;
	private static double height = 10;
	private static double depth = 5;
	private static int boxid;
	
	public static double volume() {
		
			return width * height * depth;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Volume: " + volume());
		
	}

}
