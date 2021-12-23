package movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buyticket {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Please enter the no of golden tickets: ");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		int noofgoldentickets =  Integer.parseInt(bufferRead.readLine());
		System.out.println("Please enter the no of silver tickets: ");
		BufferedReader bufferRead1 = new BufferedReader(new InputStreamReader(System.in));
		int noofsilvertickets =  Integer.parseInt(bufferRead1.readLine());
		int goldentickect = 200 ;
		int sliverprice = 150;
		int finalcostofgoldenticket;
		int finalcostofsilverticket;
		int finalticketprice;
		finalcostofgoldenticket= noofgoldentickets*goldentickect;
		System.out.println("final cost of golden ticket: " +finalcostofgoldenticket);
		finalcostofsilverticket= noofsilvertickets*sliverprice;
		System.out.println("final cost of silver ticket: " +finalcostofsilverticket);
		finalticketprice=finalcostofgoldenticket+finalcostofsilverticket;
		System.out.println("Total tickets cost: " +finalticketprice);
		
		

	}

}
