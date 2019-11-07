interface Moveable
{
 int AVG-SPEED = 40;
 void move();
}

class Interface1 implements Moveable
{
 public void move()
 {
  System.out.println("Average speed is"+AVG-SPEED);
 }
 public static void main (String[] arg)
 {
  Interface1 vc = new Interface1();
  vc.move();
 }
}
