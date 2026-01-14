package package_1;

import java.util.*;

public class Lab7 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter mobile number");
		String mob = in.nextLine();
		in.close();
		Person obj = new Person("Raghav","Kaushal",(Gender) null,mob);
		System.out.println("Personal Details:");
		System.out.println("_________________");
		System.out.println();
		System.out.println("Firstname: " + obj.getFirstName());
		System.out.println("Lastname: " + obj.getLastName());
		System.out.println("Gender: " + obj.getGender());
		System.out.println("Gender: " + obj.getMobileNumber());
	}

}
