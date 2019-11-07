public class StaticVarBlock {
  static int c = 1;
  static {
    System.out.println("First static block");
  }
  static {
    System.out.println("Second static block");
  }
  public static void main(String [] args) {
    StaticVarBlock ob1 = new StaticVarBlock();
    StaticVarBlock ob2 = new StaticVarBlock();
    System.out.println(ob1.c + "=====" + ob2.c);
    ob1.c += 1;
    System.out.println(ob1.c + "=====" + ob2.c);
    ob2.c += 1;
    System.out.println(ob1.c + "=====" + ob2.c);
    ob1.c += 1;
    ob2.c += 1;
    System.out.println(ob1.c + "=====" + ob2.c);
  }
}
