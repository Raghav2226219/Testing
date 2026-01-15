package package_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lab15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Date of Birth: (yyyy-mm-dd)");
		String dob = in.nextLine();
		
		System.out.println("Enter Firstname");
		String fn = in.nextLine();
		
		System.out.println("Enter Lastname");
		String ln = in.nextLine();
		
		LocalDate inputDate = LocalDate.parse(dob);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Independence:"+inputDate.format(formatter));
		System.out.println("Welcome " + fn + " " + ln);
		
	}

}
