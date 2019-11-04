class  First{
  int a,b;
  First(int a, int b) {
    this.a = a;
    this.b = b;
  }
  void disp() {
    System.out.println("I am first");
    System.out.println(a);
    System.out.println(b);
  }
}

class Second extends First {
  int x,y;
  void disp() {
    System.out.println("I am second");
    System.out.println(x);
    System.out.println(y);

  }
  Second(int w,int z,int x ,int y) {
    super(w,z);
    this.x = x;
    this.y = y;
    super.disp();
    disp();
  }
}

public class SuperKey {
  public static void main(String [] args) {
    Second k = new Second(1,2,3,4);
  }
}
