import java.util.*;
import java.util.stream.*;

public class IntStream1 {
  public static void main(String [] args) {
    IntStream.range(1, 20)
    .filter(x -> x%2 != 0)
    .sorted()
    .forEach(System.out::println);
  }
}
