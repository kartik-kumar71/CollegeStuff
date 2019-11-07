interface Animal {
  void sound();
  void breathe();
}

class Dog implements Animal{
  Dog() {
    sound();
    breathe();
  }
  public void sound() {
    System.out.println("Bark");
  }
  public void breathe() {
    System.out.println("Breathing with lungs\n");
  }
}

class Cat implements Animal{
  Cat() {
    sound();
    breathe();
  }
  public void sound() {
    System.out.println("Meow");
  }
  public void breathe() {
    System.out.println("Breathing with lungs\n");
  }

}

class Fish implements Animal{
  Fish() {
    sound();
    breathe();
  }
  public void sound() {
    System.out.println(".....");
  }
  public void breathe() {
    System.out.println("Breathing with gills\n");
  }
}

public class Interface {
  public static void main(String [] args) {
    Fish tuna = new Fish();
    Dog spike = new Dog();
    Cat tom = new Cat();
  }
}
