import java.util.*;

public class Locale2{
  public static void main(String[] args) {
    List<Locale> lcs = new ArrayList<Locale>();
    lcs.add(new Locale("en","US"));
    lcs.add(new Locale("es","ES"));
    lcs.add(new Locale("it","IT"));
    lcs.add(new Locale("hi","IN"));

    for (Locale x:lcs) {
      String dispLang = x.getDisplayLanguage(x);
      System.out.println(x.toString()+": "+dispLang);
    }
  }
}
