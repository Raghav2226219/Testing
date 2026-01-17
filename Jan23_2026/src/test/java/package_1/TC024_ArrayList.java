package package_1;

import java.util.*;

public class TC024_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0,new Integer(42));
		int total = list.get(0).intValue();
		System.out.println("Total: " + total);
		System.out.println();
		
		ArrayList<String> list2 = new ArrayList<String>();
		String str = "Hey!";
		list2.add(str);
		list2.add("What's Up");
		System.out.println(list2.size());
		System.out.println();
		System.out.println(list2);
		System.out.println();
		
		
		for(String words: list2) {
			System.out.print(words + " ");
		}
		

	}

}
