import java.util.Arrays;

public class ArraysUtil {
  public static void main(String [] args) {
    int [] a = {2,5,12,56,12,59};
    int [] b = {5,6,2,8,4,78};
    char [] c = {'a','k','l','r','o','p'};
    String [] d = {"apple","mango","pineapple","lychee","pomegranate"};

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));

    Arrays.sort(c);
    Arrays.sort(d);

    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(d));

    System.out.println(Arrays.equals(a,b));

  }
}
