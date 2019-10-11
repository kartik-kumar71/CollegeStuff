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
class AnimalTrainer {
    public void teach(Animal anim) {
        // do animal-things
        anim.move();
        anim.eat();
 
        // if there's a dog, tell it barks
        if (anim instanceof Dog) {
            Dog dog = (Dog) anim;
            dog.bark();
        }
    }
}

class DownCast1
{
	public static void main(String args[])
	{
		Dog dog = new Dog();
		Cat cat = new Cat();
 		AnimalTrainer trainer = new AnimalTrainer();
		trainer.teach(cat);
		trainer.teach(dog);
		
	}
}