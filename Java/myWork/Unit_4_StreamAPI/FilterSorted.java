import java.util.*;
import java.util.stream.*;


public class FilterSorted {
  public static void main(String [] args) {
    List<String> lst =Arrays.asList("sf1", "sdgf2", "fgdf1", "fs2", "sdf1","be34","b234");
    lst
    .stream()
    .filter(s -> s.startsWith("s"))
    // :: for method reference
    //Alternative of lambda
    //x -> String.toUpperCase(x)
    .map(String::toUpperCase)
    .sorted()
    //Alternative of lambda
    //x -> System.out.println(x)
    .forEach(System.out::println);
  }
}
