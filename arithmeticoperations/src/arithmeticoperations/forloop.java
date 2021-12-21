package arithmeticoperations;


public class forloop {

	public static void main(String[] args) {
		/*System.out.println("print 1 to 10");
		for(int a=1; a<=10; a++)
			System.out.println(+a);

		//Write a program to print 10 even numbers and 10 odd numbers
		
		System.out.println("Even numbers between 1 and 20: ");
	      for(int a = 1; a <= 20; a++)
	      {
	         if(a % 2 == 0)
	         {
	            System.out.print(a + " ");
	         }
	      }
	      System.out.println("\nOdd numbers between 1 and 20: ");
	      for(int a = 1; a <= 20; a++)
	      {
	         if(a % 2 != 0)
	         {
	            System.out.print(a + " ");
	         }
	      }
		Write a program to find factorial of a number
		System.out.println("print factorial numbers: ");
		int num = 5;
		int result =1;		 
		
		for (num=5;num>=1;num--)
		{
			System.out.println("Number is  " + num );
			System.out.println("Step 1 :" + result );
			
			result=result*num;
			
			System.out.println("Step 2 :" + result );
			System.out.println(result);
			}
			
		Write a program to generate tables of 10
		int number =10;
		
	      for(int a = 1; a <= 10; a++)
	      {
	         System.out.println(number + " * " + a + " = " + number * a);
	      }

Write a program to add the digits of a number
		String data = "98786487";
		int length = String.valueOf(data).length();
		System.out.println(length);
		int position;
		int number;
		int result=0;		
		for (position=0;position<=length-1;position++)
		{
            number = Character.getNumericValue(data.charAt(position));
            System.out.println("Value at Postition :" + position + " is : " + number);
            result = number + result;
            
		}
		
		System.out.println("Addition of digits is : " + result);
	
		Write a program to generate 10 Fibonacci numbers*/
		
		
		  int firstnumber =0;
		  System.out.println(firstnumber);
		  int SecondNumber = 1;
		  System.out.println(SecondNumber);		
		  int Fibonaccinumber=1;
		  int newfibonacci=1;
		  int PreviousNumber=1;
	      for(int a = 1; a <= 10; a++)
	      {
	    	  
	    	  newfibonacci = Fibonaccinumber + PreviousNumber;
	    	  Fibonaccinumber=PreviousNumber;
	    	  PreviousNumber = newfibonacci;
	    	  System.out.println(PreviousNumber);	
	      }
	}
}
