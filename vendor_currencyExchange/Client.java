/**
 * @author Ashley.Ridout
 * @date June 10, 2017
 */
package vendor_currencyExchange;

import java.util.Scanner;

public class Client {
	// main method to change currency to preferred currency
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String p;
			String input;
			String moneyType;
			
			// objects from constructors
			EuroExchanger euroX = new EuroExchanger();
			PoundExchanger poundX = new PoundExchanger();
			DollarExchanger dollarX = new DollarExchanger();
			
			// output to console
			System.out.println("Please type the total cost of the order.");
			p = scan.nextLine();
			double price = Double.parseDouble(p);
			
			System.out.println("This order totals $" + price +". Please type 'exchange' to change to another currency.");
			input = scan.nextLine();
			
			// user can exchange currency by typing 'exchange'
			if(input.equalsIgnoreCase("exchange")){
				System.out.println("Please type the currency in which to pay for this order: 'dollar', 'euro' or 'pound'.");
				
			// all other input is incorrect
			} else {
				System.out.println("Please retry by typing 'exchange'.");
				System.exit(0);
				}
			
			//if user enters 'euro', 'pound' or 'dollar', appropriate handleRequest method runs 
			moneyType = scan.nextLine();
			if(moneyType.equalsIgnoreCase("euro")){
				euroX.exchange(price);
				euroX.handleRequest();
			}
			else if(moneyType.equalsIgnoreCase("pound")){
				poundX.exchange(price);
				poundX.handleRequest();
			}
			else if(moneyType.equalsIgnoreCase("dollar")){
				poundX.exchange(price);
				dollarX.handleRequest();
				
			// all other input is incorrect
			} else {
				System.out.println("Please retry by typing 'dollar', 'euro' or 'pound'.");
				System.exit(0);
				}
			scan.close();
		}
}
