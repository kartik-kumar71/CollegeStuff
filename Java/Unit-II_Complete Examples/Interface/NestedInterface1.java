interface Showable{  
  void show();  
  interface Message{  
   void msg();  
  }  
}  
class NestedInterface1 implements Showable.Message{  
	public void msg(){
		System.out.println("Hello nested interface");
	}  
	  
	public static void main(String args[]){  
		Showable.Message message=new NestedInterface1();//upcasting here  
		message.msg();  
	}  
}  