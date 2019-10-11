abstract class Person{  
	abstract void eat(); 
	void display(){
		System.out.println("Non Abstract Method");
	}
}  
class TestAnonymousInner{  
	public static void main(String args[]){  
	Person p=new Person(){  
		void eat(){
			System.out.println("nice fruits");
		}  
	};  
	p.eat();  
	p.display();
	}  
}  