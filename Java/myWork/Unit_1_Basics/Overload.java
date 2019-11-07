class Test {
  Test(int x) {
    System.out.println("Integer : " + x);
  }
  Test(String x) {
    System.out.println("String : " + x);
  }
  Test(float x) {
    System.out.println("Float : " + x);
  }
  Test() {
    System.out.println("None");
  }
}

public class Overload {
  static void sum(int x , int y) {
    System.out.println(x+y);
  }
  static void sum(float x, float y){
    System.out.println(x+y);
  }
  static void sum(String x, String y) {
    System.out.println(x+y);
  }
  public static void main(String [] args) {
    Test a = new Test(1);
    Test b = new Test("Hello");
    Test c = new Test(0.1f);
    Test d = new Test();
    sum(1,2);
    sum(0.3f,0.4f);
    sum("asd","wer");


  }
}
