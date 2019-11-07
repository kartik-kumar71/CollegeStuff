import java.util.*;

public class Vector1 {

   public static void main(String args[]) {

      Vector<String> langs = new Vector<String>(3);

      langs.addElement("Python");
      langs.addElement("Java");
      langs.addElement("Swift");
      langs.addElement("C++");

      System.out.println("Size : "+langs.size());
      System.out.println("Default capacity increment is: "+langs.capacity());

      langs.addElement("Javascript");
      langs.addElement("Ruby");
      langs.addElement("Objective-C");

      System.out.println("Size after addition: "+langs.size());
      System.out.println("Capacity after increment is: "+langs.capacity());

      System.out.println(langs);
   }
}
