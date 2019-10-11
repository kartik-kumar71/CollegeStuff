interface Printable{  
	void print();  
}  
interface Showable{  
	void show();  
}  
interface Test extends Printable, Showable{
	void display();
}

class MultipleInheritance3 implements Test{  
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
		MultipleInheritance3 obj = new MultipleInheritance3();  
		obj.print();  
		obj.show();  
		obj.display();
	}  
} 
