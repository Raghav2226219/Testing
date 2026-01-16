package package_1;

public interface TC016_Interface {
	int add(int a, int b);
	int i = 10;  //
}

class cal implements TC016_Interface{
	
	public int add(int a, int b) {
		return a+b;
	}
	
}
