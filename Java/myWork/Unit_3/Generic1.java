public class Generic1 {

    static <T> T add(T x, T y){
      Double sum = 0.0;
      double a1 = (Double) (x);
      double b2 = (Double) (y);

      sum = a1 + b2;
      return ((T) sum);
    }
    public static void main(String args[])
    {
      double u = 0.6;
      double v = 4.2;
      double sum = (Double) (add(u, y));
      System.out.println("Sum="+sum);
    }
}
