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

class DownCast
{
	public static void main(String args[])
	{
		Animal anim = new Cat();
		//Animal anim = new Dog();
		if (anim instanceof Cat) {
			Cat cat = (Cat) anim;
			cat.meow();
		} else if (anim instanceof Dog) {
			Dog dog = (Dog) anim;
			dog.bark();
		}
	}
}