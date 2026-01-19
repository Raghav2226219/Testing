package package_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Lab4_4 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();

        products.add("Mobile");
        products.add("Cup");
        products.add("Apple");
 
        Collections.sort(products);

        for (String p : products) {
            System.out.println(p);
        }
 
        sc.close();
    }
}
