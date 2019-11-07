interface Printable{  
	void print();  
}  
interface Showable{  
	void print();  
}  
  
class MultipleInheritance2 implements Printable, Showable{  
	public void print(){
		System.out.println("Hello");
	}  
	public static void main(String args[]){  
		MultipleInheritance2 obj = new MultipleInheritance2();  
		obj.print();  
	}  
}  