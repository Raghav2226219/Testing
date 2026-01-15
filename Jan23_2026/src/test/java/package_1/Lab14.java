package package_1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class Lab14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		
		ZonedDateTime ct = ZonedDateTime.now(ZoneId.of(input));
		
		System.out.println(ct);
	}

}
