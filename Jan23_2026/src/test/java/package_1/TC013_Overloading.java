package package_1;

class car{
	int noOfCylinders;
	int noOfValues;
	int enginePower;
	boolean isPowerSteering;
	
	car(){
		noOfCylinders = 3;
		noOfValues = 4;
		enginePower = 46;
		isPowerSteering = false;
	}
	
	car (boolean isPowerSteering){
		this.isPowerSteering = isPowerSteering;
	}
	
	car(int noOfCylinders, int noOfValues, int enginePower){
		this.noOfCylinders = noOfCylinders;
		this.noOfValues = noOfValues;
		this.enginePower = enginePower;
		this.isPowerSteering = true;
	}
}

public class TC013_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car obj1 = new car();
		System.out.println();
		System.out.println(obj1.noOfCylinders);
		System.out.println();
		System.out.println("##################");
		
		car obj2 = new car(false);
		System.out.println();
		System.out.println(obj2.isPowerSteering);
		System.out.println();
		System.out.println("##################");
		
		car obj3 = new car(4,50,4);
		System.out.println();
		System.out.println("No of Cylinders: " + obj3.noOfCylinders);
		System.out.println("No of Values: " + obj3.noOfValues);
		System.out.println("No of Engine Power: " + obj3.enginePower);
		System.out.println("No of Power Steering: " + obj3.isPowerSteering);
		
	}

}
