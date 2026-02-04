package javaprogramsforpractice;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		//Switch Case Statement
		
		int WeekNumber = 78;
		
		
		switch(WeekNumber) {
		
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default:System.out.println("Invalid Week Number");
		
		}
		
		//Task Largest of 2 numbers using if else and ternary operator
		
		
		int a = 8, b= 7;
		if(a<b) {
			System.out.println("b is big number");
		}
		else {
			System.out.println("a is a big number");
		}
		
		
		// Using ternary Operator
		
		int c=74, d=87;
		
		int x = (c>d) ? c:d;
		
		System.out.println(x);
		
		
		int y =(1>2)? c:d;
		System.out.println(y);
		
				
		
	}

}
