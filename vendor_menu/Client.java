/**
 * @author Ashley.Ridout
 * @date June 12, 2017
 *
 */
package vendor_menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Client extends Menu{
	   //main method to add menu items, price, condiment option and/or size option
	   public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   int i;
		   
		   //output to console
		   System.out.println("Please enter the number of new menu items you would like to add.");
		   i = scan.nextInt();
		   //arrayList for inputted menu items
		   ArrayList<Item> listOfItems = new ArrayList<Item>(); 
		   
		   //continue adding menu items up to the number inputted by user (i)
		   for(int n = 0; n<i; n++){   
		   //execute methods to add menu items, option to add condiments, option to add size
	        addItem(listOfItems);
	        addCondiment(listOfItems);
	        addSize(listOfItems);
		   }
		   scan.close();
	    }
}
