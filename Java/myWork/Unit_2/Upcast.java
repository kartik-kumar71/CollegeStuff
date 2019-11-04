class A {
  void show() {
    System.out.println("I am A");
  }
}

class B extends A{
  void show() {
    System.out.println("I am B");
  }
}
class C extends A{
  void show() {
    System.out.println("I am C");
  }
}

public class Upcast {
  public static void main(String [] args) {
    A ob1 = new A();
    B ob2 = new B();
    C ob3 = new C();
    A ob4 = new B();  //upcasting
    A ob5 = new C();

    ob1.show();
    ob2.show();
    ob3.show();
    ob4.show();
    ob5.show();

  }
}
