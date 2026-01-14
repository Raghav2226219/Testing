package package_1;

import java.util.*;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person obj = new Person("Bob","Doe",(Gender) null);
		
		Gender g = null;
		while(g == null) {
			System.out.println("Enter gender: ");
			String ginput = sc.nextLine();
			g = Gender.imp(ginput);
			if(g == null) {
				System.out.println("Invalid input");
			}
		}
		
		sc.close();
		
		obj.setGender(g);
		
		System.out.println("Personal Details:");
		System.out.println("_________________");
		System.out.println();
		System.out.println("Firstname: " + obj.getFirstName());
		System.out.println("Lastname: " + obj.getLastName());
		System.out.println("Gender: " + obj.getGender());
	}

}
