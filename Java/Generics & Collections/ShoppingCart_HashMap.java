import java.util.HashMap;

public class ShoppingCart_HashMap {
 
    public static void main(String a[]){
    	
        HashMap<String, Double> groceryItems = new HashMap<String, Double>();
        
        //add grocery Items to Shopping cart
        
        groceryItems.put("Tomatoes", 10.50);
        groceryItems.put("Onions", 4.50);
        groceryItems.put("Potatoes", 20.00);
        groceryItems.put("Canola Oil", 7.00);
        System.out.println("\n" +groceryItems);
        
        //getting value for the given key from hashmap
        
        System.out.println("\nPrice of Onions: "+groceryItems.get("Onions"));
        System.out.println("\nIs HashMap empty? "+groceryItems.isEmpty());
        
        groceryItems.remove("Potatoes");
        
        System.out.println("\n"+groceryItems);
        System.out.println("\nSize of the HashMap: "+groceryItems.size());
    }
}
