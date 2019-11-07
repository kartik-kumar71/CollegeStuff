
import java.util.HashMap;
import java.util.Set;

public class Iterating_ShoppingCart_HashMap {

	public static void main(String a[]) {

		HashMap<String, Double> groceryItems = new HashMap<String, Double>();

		// add grocery Items to Shopping cart

		groceryItems.put("Tomatoes", 10.50);
		groceryItems.put("Onions", 4.50);
		groceryItems.put("Potatoes", 20.00);
		groceryItems.put("Canola Oil", 7.00);
		System.out.println("\n" + groceryItems);

		// Iterating through HashMap Items

		System.out.println("\nReterive Each Items Names from our Grocery List of Items \n");
		//public Set keySet(): This method is used to return the Set view containing all the keys.
		Set<String> groceryItemNames = groceryItems.keySet();
		
		for (String eachItem : groceryItemNames) {

			System.out.println(eachItem);

		}

	}
}
