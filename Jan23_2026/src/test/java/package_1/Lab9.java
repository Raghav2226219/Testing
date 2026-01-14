package package_1;

import java.util.*;

public class Lab9 {

   public static String itself(String s) {
       return s + s;
   }

   public static String replaceodd(String s) {
       StringBuilder out = new StringBuilder(s.length());
       for (int i = 0; i < s.length(); i++) {
           out.append(i % 2 == 0 ? '#' : s.charAt(i));
       }
       return out.toString();
   }


public static String duplicates(String s) {
    StringBuilder out = new StringBuilder(s.length());

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        boolean seenBefore = false;

        for (int j = 0; j < i; j++) {
            if (s.charAt(j) == c) {
                seenBefore = true;
                break;
            }
        }

        if (!seenBefore) {
            out.append(c);
        }
    }
    return out.toString();
}


   public static String changetoupper(String s) {
       if (s == null) s = "";
       StringBuilder out = new StringBuilder(s.length());
       for (int i = 0; i < s.length(); i++) {
           out.append(i % 2 == 0 ? Character.toUpperCase(s.charAt(i)) : s.charAt(i));
       }
       return out.toString();
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String input = sc.nextLine();

       System.out.println(itself(input));
       System.out.println(replaceodd(input));
       System.out.println(duplicates(input));
       System.out.println(changetoupper(input));

       sc.close();
   }
}
