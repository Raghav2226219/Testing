package package_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
        System.out.println("yyyy-MM-dd: ");
        String input = sc.nextLine();
        
        System.out.println("Enter number of warrenty years: ");
        int y = sc.nextInt();
        
        System.out.println("Enter number of warrenty months: ");
        int m = sc.nextInt()
; 
        LocalDate inputDate = LocalDate.parse(input);
        LocalDate war = inputDate.plusYears(y).plusMonths(m);
        
        System.out.println(war);
 
        sc.close();
	}

}
