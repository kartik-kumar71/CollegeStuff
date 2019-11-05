public class Exception2
{  
  public static void main(String args[])
  { 
	for (int i=1;i<=5;i++)
		System.out.println(i);  
	try
		{  
			int data=100/0;  //Protected code
		}
	catch(ArithmeticException e)
		{
			System.out.println(e);
		}  
	for (int i=1;i<=5;i++)
		System.out.println(i);
	System.out.println("rest of the code...");  
  }  
}  