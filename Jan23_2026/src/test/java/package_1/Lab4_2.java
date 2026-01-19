package package_1;

import java.io.File;
import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            File f = new File("C:\\Users\\Raghav.Kaushal\\git\\Testing\\Jan23_2026\\src\\test\\java\\package_1\\numbers.txt");
 
            Scanner sc = new Scanner(f);
            sc.useDelimiter("[,\\s]+");
            boolean any = false;
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    int n = sc.nextInt();
                    if ((n & 1) == 0) {
                        System.out.println(n);
                        any = true;
                    }
                } else {
                    sc.next();
                }
            }
            sc.close();
            if (!any) System.out.println("(no even numbers found or parsing failed)");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
