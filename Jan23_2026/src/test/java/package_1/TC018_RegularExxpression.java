package package_1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TC018_RegularExxpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "12345";
		String regex = "\\d+";
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		boolean result = m.matches();
		
		if(result == true) {
			System.out.println("Valid Number");
		}else {
			System.out.println("Invalid Number");
		}
		
		String input2 = "Shop, Mop, Hopping, Chopping";
		Pattern pattern = Pattern.compile("hop");
//		Pattern pattern = Pattern.compile(".*");
		Matcher match = pattern.matcher(input2);
		
		System.out.println(match.matches());
		
		while(match.find()) {
			System.out.println(match.group() + ": " + match.start() + ": " + match.end());
		}
		
		String input1="today is monday and tomorrow is tuesday and";
		Pattern pattern3=Pattern.compile("and");
		Matcher match3=pattern3.matcher(input1);
		System.out.println(match3.matches());
		
		while(match3.find())
				{
			System.out.println(match3.group()+":"+match3.start()+":"+match3.end());
				}
		
		
		String phonemnumer ="8612345439";
		String regex1="\\d{10}";
 
		Pattern p1=Pattern.compile(regex1);
		Matcher m1=p1.matcher(phonemnumer);
		boolean result1=m1.matches();
		if(result1==true)
		{
			System.out.println("Valid phone number");
		}
		
		else
		{
			System.out.println("Invalid phone Number");
		}	
		
		String imp1 ="Exo1";
		String reg1="^[A-Z][a-z]+[0-9]$";
 
		Pattern p2=Pattern.compile(reg1);
		Matcher m2=p2.matcher(imp1);
		boolean result2=m2.matches();
		if(result2==true)
		{
			System.out.println("Matching");
		}
		
		else
		{
			System.out.println("Not Matching");
		}	
		String email ="test@gmail.com";
		String emailregex2="^[A-Za-z0-9._%+-]+@[A-Za-z0-9._%+-]+\\.[A-Za-z]{2,}$";
		 
		Pattern emailp2=Pattern.compile(emailregex2);
		Matcher emailm2=emailp2.matcher(email);
		boolean emailresult2=emailm2.matches();
		if(emailresult2==true)
		{
		System.out.println("email matching");
		}
		 
		else
		{
		System.out.println("email not matching");
		}
;	}

}
