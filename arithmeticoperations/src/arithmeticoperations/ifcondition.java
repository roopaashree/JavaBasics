package arithmeticoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifcondition {

	public static void main(String[] args) throws IOException {
		
			 
		/* age check for voting
		System.out.println("Please enter the age  : ");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));		
	    int age =  Integer.parseInt(bufferRead.readLine());
	 
	 if (age > 17) 
 	   {
	      System.out.println("Congrats!!! You are eligible for Voting.");
	}
	 else
	   {
	      System.out.println("sorry you are not eligible for voting");
	}	*/
		
		/*System.out.println("Please enter the number  : ");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));	
		//System.out.println(bufferRead.readLine());
	    int number =  Integer.parseInt(bufferRead.readLine());
		//String number1=bufferRead.readLine()
	    if (number >0) 
	 	   {
		      System.out.println("The number is positive.");
		}
	    else if (number == 0) 
	 	   {
		      System.out.println("The number neither positive nor negative.");
		}
		 else
		   {
		      System.out.println("The number is negative.");
	}
	    //Largest of two numbers//
	    System.out.println("Please enter the first number  : ");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));		
	    int number =  Integer.parseInt(bufferRead.readLine());
	  //String number1=bufferRead.readLine()
	    System.out.println("Please enter the second number  : ");
		BufferedReader bufferRead1 = new BufferedReader(new InputStreamReader(System.in));		
	    int number1 =  Integer.parseInt(bufferRead1.readLine());
	    if (number >number1) 
	 	   {
		      System.out.println("The largest no is:" +number);
		}
	    
	    else if (number == number1)
		   {
		      System.out.println("The numbers are same");
	}
	    
		 else
		   {
		      System.out.println("The largest no is:"+number1);
		      
	}*/
		
		//odd  r even with %operations
	
		System.out.println("Please enter the number  : ");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));	
		 int num1 =  Integer.parseInt(bufferRead.readLine());
		 if (num1 %2 == 0)
		 {
		 System.out.println("The number is even  : "+num1);
		 }
		 else
		 {
			 System.out.println("The number is odd  : "+num1); 
		 } 
	}
}
