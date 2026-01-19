package package_1;

import java.util.*;
import java.io.*;

public class Lab4_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   String file = "C:\\Users\\Raghav.Kaushal\\git\\Testing\\Jan23_2026\\src\\test\\java\\package_1\\Lab4_1_0.txt";
		   
	        
	        FileReader fr = new FileReader(file);
	        String data = "";
	        int ch;
	 
	        while ((ch = fr.read()) != -1) {
	            data = data + (char) ch;
	        }
	        fr.close();
	 
	        
	        String reversed = new StringBuilder(data).reverse().toString();
	 
	        
	        FileWriter fw = new FileWriter(file);
	        fw.write(reversed);
	        fw.close();
	 
	        System.out.println("File reversed successfully");
	}

}
