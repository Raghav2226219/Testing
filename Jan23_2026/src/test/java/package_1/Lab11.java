
package package_1;

import java.util.Scanner;
import java.time.*;
import java.time.LocalDate;

public class Lab11 {
	
	static void cal(LocalDate startDate, LocalDate endDate) {
        Period period = Period.between(startDate, endDate);
 
        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("yyyy-MM-dd: ");
        String input = sc.nextLine();
 
        LocalDate inputDate = LocalDate.parse(input);
        LocalDate today = LocalDate.now();
 
        cal(inputDate, today);
 
        sc.close();
    }
}
 
