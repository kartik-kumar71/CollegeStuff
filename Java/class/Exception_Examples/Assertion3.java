import java.util.Scanner;  
    
class Assertion3
{  
	public void Test(int a)
	{
		assert a>=18:" You are not Eligble for Vote";  
		System.out.println("Your age: "+a);  
	}
	public static void main( String args[] )
	{  
		Assertion3 obj=new Assertion3();
		Scanner scanner = new Scanner( System.in );  
		System.out.print("Enter ur age ");  
		int value = scanner.nextInt();  
		obj.Test(value); 
		//System.out.println("Your age: "+value);  
	}   
}  