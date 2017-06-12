/**
 * @author Ashley.Ridout
 * @date June 10, 2017
 */
package vendor_currencyExchange;

abstract class CurrencyExchangeAlg {
	// final method to handle request that cannot be overridden
	double price;
	double newPrice;
	public final void handleRequest(){
		displayExchangeRate();
		exchange(price);
		print(price);
		endMessage();		
	}
	
	// abstract methods that will be implemented in the subclass
	abstract void displayExchangeRate();
	abstract void exchange(double price2);
	abstract void print(double price2);

	// common method for all implementations
	 void endMessage(){
		 System.out.println("This order has been changed to the customer's preferred currency.");
	 }
}
