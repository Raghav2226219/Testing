package package_1;

import java.io.FileInputStream;
import java.io.IOException;
 
public class TC027_FileIO {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Raghav.Kaushal\\git\\Testing\\Jan23_2026\\src\\test\\java\\package_1\\sampleinput.txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.println((char)data);
		}
		
		fis.close();
		
 
	}
 
}




