package javaprogramsforpractice;

public class ProgramforDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		System.out.println("Welcome to Java");
		//Approach 1 if all the variable belongs to different data types.
		int a = 100;
		int b =200;
		int c= 300;
		//Approach 2 if all variables belongs to same data types.
		int  x,y,z;
		x=100;
		y=200;
		z=300;
		//Approach 3 if all variables belongs to same data types.
		int m=100,n=200,o=300;
		System.out.println(m+" "+n+" "+o);

		
		System.out.println(x+" "+y+" "+z);
		
		System.out.println("The value of a is: "+a);

		System.out.println("The value of a is: "+b);

		System.out.println("The sum of a+b is:"+" "+(a+b));
		
		System.out.println("The sum of a+b is:"+(a+c));
		
		byte by = 77;
		System.out.println(by);
		short sh = 7833;
		System.out.println(sh);
		int i = 78927928;
		System.out.println(i);
        long l = 2382863682828L;         //Literal is needed must be L
        System.out.println(l);
          
        float fl = 747.448f;             //Literal is needed F/f
        System.out.println(fl);
        double db = 747.45453354545; 
        System.out.println(db);
        
        char grade = 'B';
        System.out.println(grade);
        String Grade = "B++";
        String name = "Teja";
        System.out.println(Grade);
        System.out.println(name);
        
        boolean condition = true;
        System.out.println(condition);
	}

}
