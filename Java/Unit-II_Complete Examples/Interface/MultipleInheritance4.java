interface Printable{  
	void print();  
	default void abc()
	{
		System.out.println("Default1");
	}
	
}  
interface Showable{  
	void show(); 
	default void abc1()
	{
		System.out.println("Default2");
	}
}  
interface Test extends Printable, Showable{
	void display();
}

class MultipleInheritance4 implements Test{  
	public void print(){
		System.out.println("Hello");
	}  
	public void show(){
		System.out.println("Welcome");
	}  
	public void display(){
		System.out.println("Hi");
	}
	public static void main(String args[]){  
		MultipleInheritance4 obj = new MultipleInheritance4();  
		obj.print();  
		obj.show();  
		obj.display();
		obj.abc();
	}  
} 
