package javaprogramsforpractice;

public class IncrementandDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Increment Operator ++
		//Case 1
		int a = 7;
         a = a+1;
         System.out.println(a);
         a++;
         System.out.println(a);
         
         //Case 2  Post Increment a++
         int b = 17;
         int res = b++;
         System.out.println(res);
         System.out.println(b);

         
        //Case 3 Pre Increment ++d
         int d = 88;
         int result = ++d;
         System.out.println(result);
         System.out.println(d);
         
         //Decrement Operator --
         //Case 1
         int x = 66;
         x--;
         System.out.println(x);
         //Case 2 Post Decrement x--
         int y = 24;
         int resul = y--;
         System.out.println(resul);
         System.out.println(y);
         
         //Case 2 Pre Decrement --x
         
         int z = 184;
         int r = --z;
         System.out.println(z);
         System.out.println(r);
         

		
		
		

	}

}
