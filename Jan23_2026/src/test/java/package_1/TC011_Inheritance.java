package package_1;

class Base{
	public void basemethod() {
		System.out.println("Base method");
	}
}

class Derived extends Base{
	public void derivedmethod() {
		System.out.println("Derived Method");
	}
}

public class TC011_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived dat = new Derived();
		
		dat.basemethod();
		dat.derivedmethod();
		
	}

}
