public class TypeConv{
  public static void main(String[] args) {
    double d = 3.14;

    long l = (long)d;
    int i = (int)l;
    char c = (char)i;

    int m = 18;
    long n = m;

    System.out.println("Double: "+d);
    System.out.println("Long: "+l);
    System.out.println("Int: "+i);
    System.out.println("Char: "+c);

    System.out.println("2nd Int: "+m);
    System.out.println("2nd Long: "+n);
  }
}
