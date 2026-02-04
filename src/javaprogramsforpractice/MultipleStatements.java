package javaprogramsforpractice;

public class MultipleStatements {

	public static void main(String[] args) {

		if(false) {
			System.out.println(1);
		}
		else {
			System.out.println(2);
		}
		
		if(1==1) {
			System.out.println(1);
		}
		else {
			System.out.println(2);
		}
		
		//nested if else condition
		
		if(false) {
			if(false) {
				System.out.println("abc");
				
				
			}
			else {
				System.out.println("xyz");
			}
		}
		else {
			System.out.println("123");
		}
		
		
	}

}
