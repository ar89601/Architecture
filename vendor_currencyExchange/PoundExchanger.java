/**
 * @author Ashley.Ridout
 * @date June 10, 2017
 */
package vendor_currencyExchange;

//methods specific to exchanging to pound currency
public class PoundExchanger extends CurrencyExchangeAlg {
	double pound = 0.77;
	
	public double getEuro(){
		return pound;
	}
	
	@Override
	void displayExchangeRate(){
		System.out.println("The exchange rate for dollar:pound is 1:0.77.");
	}
	
	@Override
	void exchange(double price){
		this.price = price;
		double newPrice = price * pound;
	}
	@Override
	void print(double price){
		this.price = price;
		newPrice = price * pound;
		System.out.println("This order has been changed from $" + price + " to £" + newPrice);
	}
}
