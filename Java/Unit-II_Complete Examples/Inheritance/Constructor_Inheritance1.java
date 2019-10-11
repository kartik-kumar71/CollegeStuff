// filename: Main.java 
class Base { 
	Base() { 
		System.out.println("Base Class Constructor Called "); 
	} 
} 

class Derived extends Base { 
	Derived() { 
		System.out.println("Derived Class Constructor Called "); 
	} 
} 

public class Constructor_Inheritance1 { 
	public static void main(String[] args) { 
		Derived d = new Derived(); 
	} 
} 
