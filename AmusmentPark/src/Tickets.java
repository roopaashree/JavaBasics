import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tickets {

	public static void main(String[] args) throws NumberFormatException, IOException
	
	{
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the ticket count : ");
		
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		//int  roopaa =  bufferRead.readLine();
		int ticketcount =  Integer.parseInt(bufferRead.readLine());
		
		
		int costofticket = 400;
		double discount = 10;
		double discountamount;
		double finalcostofticket;
		int finalprice;
		finalprice = ticketcount * costofticket;
		System.out.println("final cost is: "+finalprice);
		if(ticketcount>=10)
		{		
			System.out.println("Congrats you are eligible for discount");
			discountamount =  (discount/100 * finalprice);
			System.out.println("discount amount is: "+discountamount);
			finalcostofticket=finalprice-discountamount;
			System.out.println("total ticket cost : "+finalcostofticket);
		}
		else
		{
			
			System.out.println("total ticket cost : "+finalprice);
			
		}
		
	}

}
