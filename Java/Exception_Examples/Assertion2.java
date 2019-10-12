import java.util.Scanner;  
    
class Assertion2
{  
	public static void main( String args[] )
	{  
		Scanner scanner = new Scanner( System.in );  
		System.out.print("Enter ur age ");  
		int value = scanner.nextInt();  
		assert value>=18:" You are not Eligble for Vote";  
		System.out.println("Your age: "+value);  
	}   
}  