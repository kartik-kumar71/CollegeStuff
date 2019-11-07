import java.text.NumberFormat;  
import java.util.*;  
public class InternalizationCurrency1 {  
  
static void printCurrency(){  
 double dbl=10500.3245;  
 NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
 String currency=formatter.format(dbl);  
 System.out.println(currency);  
}  
  
public static void main(String[] args) {  
    printCurrency();  
}  
}  