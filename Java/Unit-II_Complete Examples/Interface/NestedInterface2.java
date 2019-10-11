class A{  
	void display()
	{
		System.out.println("Hello Outer Class");
	}
	interface Message{  
		void msg();  
	}  
}  
  
class NestedInterface2 implements A.Message{  
	public void msg(){
		System.out.println("Hello nested interface");
	}  
	public static void main(String args[]){  
		A.Message message=new NestedInterface2();//upcasting here  
		message.msg();  
		//message.display();
		//A msg=new NestedInterface2();
		//msg.display
	}  
}  