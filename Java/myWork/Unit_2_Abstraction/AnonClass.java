interface Exp {
  public void doSomething();
}


public class AnonClass {
  public static void main(String[] args) {
    Exp exp1 = new Exp() {
      public void doSomething() {
        System.out.println("echo from exp1");
      }
    };

    Exp exp2 = new Exp() {
      public void doSomething() {
        System.out.println("echo from exp2");
      }
    };


    exp1.doSomething();
    exp2.doSomething();
  }
}
