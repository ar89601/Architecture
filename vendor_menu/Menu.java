/**
 * @author Ashley.Ridout
 * @date June 12, 2017
 *
 */
package vendor_menu;

import java.util.ArrayList;
import java.util.Scanner;

//class with methods specific for sEATs menu
public class Menu{
	//class to get item name and price
	protected static class Item {
	  private String name;
      private double price;

      public Item(String name, double price) {
          this.name = name;
          this.price = price;
      }

      public String getName() {
          return name;
      }

      public double getPrice() {
          return price;
      }
	}

	//method to add item and price to ArrayList
	public static void addItem(ArrayList<Item> listOfItems) {
	        
	            System.out.println("Enter Menu Item Name.");
	            Scanner addName = new Scanner(System.in);
	            String name = (addName.nextLine());

	            System.out.println("Enter price.");
	            Scanner addPrice = new Scanner(System.in);
	            double price = (addPrice.nextDouble());

	            listOfItems.add(new Item(name, price));
	    
	        for (Item list : listOfItems) {
	            System.out.println("Menu Item: " + list.getName() + ", Price: $" + list.getPrice());
	        }
	    }
	 
	//method for option to add condiment
	 public static void addCondiment(ArrayList<Item> listOfItems){
		 System.out.println("Menu item has been added. "
		 		+ "\nDoes the menu item need the option for the customer to add condiments? Type 'yes' or 'no'.");
		 Scanner condiment = new Scanner(System.in);
		 String c = condiment.next();
		 if(c.equalsIgnoreCase("yes")){
			 System.out.println("The customer may now choose to add condiments to menu item. "
			 		+ "\nDoes the menu need the option of size such as small, medium or large? Type 'yes' or 'no'.");
		 }
		 else if(c.equalsIgnoreCase("no")){
			 System.out.println("The customer will not have the option to add condiments to menu item. "
			 		+ "\nDoes the menu item need the option of size such as small, medium or large? Type 'yes' or 'no'.");
		 }else {
				System.out.println("Please retry by typing 'yes' or 'no'.");
				System.exit(0);
				}
	 }
	 
	 //method for option to add size
	 public static void addSize(ArrayList<Item> listOfItems){	
		 Scanner size = new Scanner(System.in);
		 String s = size.next();
		 if(s.equalsIgnoreCase("yes")){
			 System.out.println("The customer may now choose a small, medium or large menu item.");
		 }
		 else if(s.equalsIgnoreCase("no")){
			 System.out.println("The customer will not have the option to choose a small, medium or large menu item.");
		 }else {
				System.out.println("Please retry by typing 'yes' or 'no'.");
				System.exit(0);
				}
	 }
}
