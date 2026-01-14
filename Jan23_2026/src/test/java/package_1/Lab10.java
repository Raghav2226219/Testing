package package_1;
import java.util.Scanner;

public class Lab10 {

    public static boolean isPositiveString(String s) {
        if (s == null || s.isEmpty()) return false;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) <= s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().trim();

        if (isPositiveString(input)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
