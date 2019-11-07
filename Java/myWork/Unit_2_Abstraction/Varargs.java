import java.util.Arrays;

public class Varargs {
  static void show(int ... x) {
    System.out.println(Arrays.toString(x));
  }
  static void show(String ... x) {
    System.out.println(Arrays.toString(x));
  }

  public static void main(String [] args) {
    show(1,2,3,4,5);
    show("asd","gdsf","dsf");
  }
}
