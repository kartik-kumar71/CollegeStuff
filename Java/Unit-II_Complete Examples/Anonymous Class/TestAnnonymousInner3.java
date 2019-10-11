interface Eatable{  
	void eat();  
}  
class TestAnnonymousInner3{  
	public static void main(String args[]){  
		Eatable e=new Eatable(){  
			public void eat(){
				System.out.println("nice fruits");
			}  
		};  
	e.eat();  
	}  
}  