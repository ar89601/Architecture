/**
 * @author Ashley.Ridout
 * @date June 10, 2017
 */
package vendor_currencyExchange;

//methods specific to exchanging to euro currency
public class EuroExchanger extends CurrencyExchangeAlg {
	double euro = 0.89;
	
	public double getEuro(){
		return euro;
	}
	
	@Override
	void displayExchangeRate(){
		System.out.println("The exchange rate for dollar:euro is 1:0.89.");
	}
	
	
	@Override
	void exchange(double price){
		this.price = price;
		double newPrice = price * euro;	
	}	
	
	@Override
	void print(double price){
		this.price = price;
		double newPrice = price * euro;
		System.out.println("This order has been changed from $" + price + " to €" + newPrice);
	}
	
}
