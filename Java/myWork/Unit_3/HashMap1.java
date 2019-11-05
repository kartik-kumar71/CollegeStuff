import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMap1{
   public static void main(String args[]){
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      hmap.put(12, "fdg");
      hmap.put(2, "dsgf");
      hmap.put(7, "sdfg");
      hmap.put(49, "dfsg");
      hmap.put(3, "retert");

      hmap.remove(7);
      System.out.println("Map key and values after removal:");
      Set s = hmap.entrySet();
      Iterator i = s.iterator();
      while(i.hasNext()) {
          Map.Entry m = (Map.Entry)i.next();
          System.out.print("Key is: "+m.getKey() + " & Value is: "+ m.getValue());
          System.out.println();
      }
   }
}
