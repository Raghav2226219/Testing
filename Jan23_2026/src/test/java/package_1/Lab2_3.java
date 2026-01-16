package package_1;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("ID: ");
        int id = Integer.parseInt(sc.nextLine());
 
        System.out.print("Name: ");
        String name = sc.nextLine();
 
        System.out.print("Salary: ");
        double salary = Double.parseDouble(sc.nextLine());
 
        System.out.print("Designation Manager/Programmer/System Associate");
        String designation = sc.nextLine();
 
        Employee emp = new Employee(id, name, salary, designation);
 
        EmployeeService service = new EmployeeServiceImpl();
        service.determineInsuranceScheme(emp);
 
        System.out.println("Employee Details:");
        System.out.println(emp);
        sc.close();
    }
}
