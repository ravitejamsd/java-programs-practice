package javaprogramsforpractice;

public class IfandIfElseConditionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   if condition
		int person_age = 27;
		if(person_age>=18) {
			System.out.println("Eligible for Vote");
		}
		
		// if else condition
		
		int Teja_age = 27;
		
		if(Teja_age>=18){
			System.out.println("Teja Can Vote");
		}
		else {
			System.out.println("Teja Can't Vote");
		}

	

	//Even or Odd Number Checking using if else
	
	int n = 17;
	if(n%2==0) {
		System.out.println("n is a even number");
		
	}
	else {
		System.out.println("n is a odd number");
	}
	
	
	// Postive number or not using if else if
	
	int m = 0;
	
	if(m>0) {
		System.out.println("Positive Number");
	}
	else if(m<0){
		
		System.out.println("Negative Number ");
		
		
	}
	 
	
	else {
		System.out.println("Zero Number");
	}
	
	
	//Largest of 3 Numbers 
	
	int a =17, b=54, c=43;
	
	
	if(a>b && a>c) {
		System.out.println("a is Big Number");
	}
	else if(b>a && b>c){
		
		System.out.println("b is Big Number");
		
	}
	else {
		System.out.println("c is Big Number");
	}
   }
	
}
