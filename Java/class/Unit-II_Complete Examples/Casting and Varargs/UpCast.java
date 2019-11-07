interface Mammal {
    public void eat();
 
    public void move();
 
    public void sleep();
}
abstract class Animal implements Mammal {
    public void eat() {
        System.out.println("Eating...");
    }
 
    public void move() {
        System.out.println("Moving...");
    }
 
    public void sleep() {
        System.out.println("Sleeping...");
    }
 
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Gow gow!");
    }
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
 
class Cat extends Animal {
    public void meow() {
        System.out.println("Meow Meow!");
    }
	public void eat() {
        System.out.println("cat is eating...");
    }
}

class UpCast
{
	public static void main(String args[])
	{
		Dog dog = new Dog();
		Animal anim = (Animal) dog;
		//Animal anim=new Dog();
		Mammal mam = new Cat();
		mam.eat();
		anim.eat();
	}
}