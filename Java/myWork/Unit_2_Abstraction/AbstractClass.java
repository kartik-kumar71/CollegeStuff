abstract class Shape {
  public abstract double area(); // Abstract methods
  public abstract double circumference();


}
class Circle extends Shape {
  public static final double PI = 3.1415;
  protected double r;
  public Circle(double r) { this.r = r; }
  public double getRadius() { return r; }
  public double area() { return PI*r*r; }
  public double circumference() { return 2*PI*r; }
}

class Rectangle extends Shape {
  protected double w, h;
  public Rectangle(double w, double h) {
    this.w = w;
    this.h = h;
  }
  public double getWidth() { return w; }
  public double getHeight() { return h; }
  public double area() { return w*h; }
  public double circumference() { return 2*(w + h); }
}


public class AbstractClass {
  public static void main(String [] args) {
    Shape[] shapes = new Shape[2];
    shapes[0] = new Circle(3.0);
    shapes[1] = new Rectangle(4.0,8.0);
    System.out.println("Area");
    System.out.println(shapes[0].area());
    System.out.println(shapes[1].area());
    System.out.println("ircumference");
    System.out.println(shapes[0].circumference());
    System.out.println(shapes[1].circumference());

  }
}
