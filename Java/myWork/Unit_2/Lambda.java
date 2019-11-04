interface Operable {
  void product(int x, int y);
}

public class Lambda {
  public static void main(String [] args) {
    Operable u = (a,b) -> {System.out.println(a+b);};
    u.product(2,3);
  }
}
