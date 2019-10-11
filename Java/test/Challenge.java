

public class Challenge {
  static <T> T sum (T a, T b) {
    if (a instanceof Double) {
      Double c=(Double)(a)+(Double)(b);
      return((T) c);
    }
    else if (a instanceof Integer) {
      Integer c = (Integer)(a)+(Integer)(b);
      return((T) c);
    }
    else if (a instanceof Float) {
      Float c = (Float)(a)+(Float)(b);
      return((T) c);
    }
    else {
      return null;
    }
  }
  public static void main(String [] Args) {
    System.out.println((Integer)sum(3,2));
    System.out.println((Float)sum(3.1f,2.1f));
    System.out.println((Double)sum(3.3,2.3));

  }
}
