package javaprogramsforpractice;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		// While Loop
//		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//  int i = 1;
//  do {
//	  System.out.println(i);
//	  i++;
//  }while(i>=10);
	  
	
	
	// Print even numbers between 1 to 10
	
     int j = 2;
	while(j<=10) {
		System.out.println(j);
		//j= j+2;
		j+=2;
	   }
  
	// Using if condition we can print even numbers between  1 to 10
	
	int k = 1;
	while (k <= 10) {
	    if (k % 2 == 0) {
	        System.out.println(k);
	    }
	    k++;
	}
	
	int i = 1;
	while(i<=10) {
		if(i%2==0) {
			System.out.println(i + "Even Number");
			
		}
		else {
			System.out.println(i + "Odd Number");
		}
		i++;
	}

  }
}
