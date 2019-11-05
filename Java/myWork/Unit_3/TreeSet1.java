import java.util.TreeSet;

public class TreeSet1 {
  public static void main(String args[]) {
		TreeSet<String> tset = new TreeSet<String>();
    tset.add("cabbage");
    tset.add("cauliflower");
    tset.add("tomato");
    tset.add("onion");

    System.out.println("The tree set is: " + tset);
		System.out.println(tset.toString());
    }
 }
