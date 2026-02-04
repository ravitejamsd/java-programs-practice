package javaprogramsforpractice;

public class OperatorsDemo {

	public static void main(String[] args) {
        int a=49,  b= 37;
        //Arthmetic Operators
        System.out.println("Sum of a and b is: "+(a+b));
        System.out.println("Diff of a and b is: "+(a-b));
        System.out.println("Multiplication of a and b is: "+(a*b));
        System.out.println("Division of a and b is: "+(a/b));
        System.out.println("Modulo Division of a and b is: "+(a%b));
        
        //Relational Operators  < ,>, <=, >=, ==, !=
        // Always returns a boolean value true or false
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
         
        b=51;
        
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
           
        
        System.out.println(a==b);
        System.out.println(a!=b);
        
       boolean res = a==b;
       System.out.println(res);
       
       // Logical Operators &&,  ||, !
       // Returns Boolean value true or false
        
       boolean x = true;
       boolean y = false;
       System.out.println(x && y);
       System.out.println(x || y);
       System.out.println(!y);
       
       boolean b1 = 10>20;
       boolean b2 = 10<20;
       
       System.out.println(b1 && b2);
       
       System.out.println((10>7) || (17<20));
       
       

	}

}
