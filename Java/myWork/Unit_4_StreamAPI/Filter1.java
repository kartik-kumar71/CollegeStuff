import java.util.*;
import java.util.stream.*;


public class Filter1 {
  public static void main(String args[]) {
    List<Integer> lst = Stream.iterate(1, x -> x + 1)
    .filter(x -> x % 2 == 0 && x > 5)
    .limit(25)
    .collect(Collectors.toList());

    System.out.println(lst);
  }
}
