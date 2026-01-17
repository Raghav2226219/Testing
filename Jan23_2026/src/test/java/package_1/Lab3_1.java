
package package_1;

import java.util.Scanner;

class NameException extends Exception {
    private String firstName;
    private String lastName;

    NameException(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public String toString() {
        return "Invalid name enter full name";
    }
}

class emp34 {
    String firstName;
    String lastName;

    void getempdetails() throws NameException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name:");
        firstName = sc.nextLine();

        System.out.println("Enter your last name:");
        lastName = sc.nextLine();

        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new NameException(firstName, lastName);
        } else {
            System.out.println("You entered valid fullname");
        }
    }
}

public class Lab3_1 {

    public static void main(String[] args) {
        emp34 obj = new emp34();
        try {
            obj.getempdetails();
        } catch (NameException e) {
            System.out.println(e);
        }
    }
}
