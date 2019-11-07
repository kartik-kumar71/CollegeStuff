class Gen<T, X, Y>
{
  T ob1;
  X ob2;
  Y ob3;

  Gen(T ob1, X ob2, Y ob3)
  {
    this.ob1 = ob1;
    this.ob2 = ob2;
    this.ob3 = ob3;
  }

  public void disp()
  {
  System.out.println(ob1);
  System.out.println(ob2);
  System.out.println(ob3);
  }
}

public class Generic2 {
  public static void main(String args[]) {
    Gen <String, Integer, Float> ob1 = new Gen<>("Antimony",89,9.9f);
    Gen <String, Integer, Float> ob2 = new Gen<>("Arsenic",90,9.89f);
    ob1.disp();
    ob2.disp();
  }
}
