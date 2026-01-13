package package_1;

class Balance{
	String name;
	double bal;
	
	public Balance(String n, double b) {
//		this.name = name;
//		this.bal = b;
		name = n;
		bal = b;
	}
	
	public void show() {
		if(bal > 0) {
			System.out.println("Name: " + name + " " + "$" + bal);
		}
	}
}

public class TC005_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balance obj = new Balance("Raghav", 10000000);
		obj.show();
	}

}
