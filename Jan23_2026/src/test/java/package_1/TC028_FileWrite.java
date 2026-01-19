package package_1;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class TC028_FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Text: ");
		
		String text = in.nextLine();
		try {
			FileWriter fw = new FileWriter("C:\\\\Users\\\\Raghav.Kaushal\\\\git\\\\Testing\\\\Jan23_2026\\\\src\\\\test\\\\java\\\\package_1\\\\sampleinput.txt");
			fw.write(text);
			System.out.println("Text writting success!!!");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to update file");
			e.printStackTrace();
		}

	}

}
