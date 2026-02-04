package javaprogramsforpractice;

public class PrintWeekNames {

	public static void main(String[] args) {
		
		
		// Display Week Names Based on Week Numbers
		
		int WeekNumber = 7;
		
		if(WeekNumber==1){
			System.out.println("Sunday");
		}
		else if(WeekNumber==2){
			System.out.println("Monday");
			
		}
		else if(WeekNumber==3){
			System.out.println("Tuesday");
		}
		else if(WeekNumber==4) {
			System.out.println("Wednesday");
		}
		else if(WeekNumber==5) {
			System.out.println("Thursday");
			
		}
		else if (WeekNumber==6) {
			System.out.println("Friday");
		}
		else if (WeekNumber==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid Week Number");
		}
		
		
		
	}

}
