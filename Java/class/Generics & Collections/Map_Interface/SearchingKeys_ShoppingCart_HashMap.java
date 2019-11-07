import java.util.HashMap;
import java.util.Set;

public class SearchingKeys_ShoppingCart_HashMap {

	public static void main(String a[]) {

		HashMap<String, Double> groceryItems = new HashMap<String, Double>();

		// add grocery Items to Shopping cart

		groceryItems.put("Tomatoes", 10.50);
		groceryItems.put("Onions", 4.50);
		groceryItems.put("Potatoes", 20.00);
		groceryItems.put("Canola Oil", 7.00);
		System.out.println("\n" + groceryItems);

		// Iterating through HashMap Items

		System.out.println("\nSearching Grocery List of Items keys or Names \n");

		if (groceryItems.containsKey("Canola Oil")) {

			System.out.println("The shoppingCart contains key Canola Oil");

		} else {

			System.out.println("The shoppingCart does not contains key Canola Oil");

		}

		if (groceryItems.containsKey("JackFruit")) {

			System.out.println("The shoppingCart contains key JackFruit");

		} else {

			System.out.println("The shoppingCart does not contains key Onions");

		}

	}
}
