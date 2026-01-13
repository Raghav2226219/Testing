package package_1;

import  java.util.*;

public class Lab_5 {
		
	static boolean check(int a) {
			if(a>0) {
				return true;
			}
			return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
       int num = in.nextInt();
		
		if (check(num)) {
			System.out.println("positive");
		}else {
			System.out.println("negative");
		}
		
	}

}
