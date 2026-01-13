package package_1;

public class TC002_Control_Statements {
	public int a = 90;
	static void oddEven() {
		 int num = 19;
			
			if(num%2 == 0) {
				System.out.println("Even number");
			}else {
				System.out.println("Odd number");
			}
			
	}
	static void grade() {
       
		int num2 = 50;
		
		if(num2 >= 90) {
			System.out.println("Grade: O");
		}
		else if(num2 < 90 && num2 >= 80) {
			System.out.println("Grade: A");
		}
		else if(num2 < 80 && num2 >= 75) {
			System.out.println("Grade: B");
		}
		else{
			System.out.println("Grade: C");
		}
		
	}
	
	static void swi() {
		int day = 3;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		}
	}
	
	static void loop() {
		for (int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int j=6;
		while(j!=11) {
			System.out.print(j + " ");
			j++;
		}
		
		System.out.println();
		
		int k = 11;
		do {
			System.out.print(k + " ");
			k++;
		}while(k<16);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		oddEven();
		grade();
		swi();
		loop();
		
	}

}
