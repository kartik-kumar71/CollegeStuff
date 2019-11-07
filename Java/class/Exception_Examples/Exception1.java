import java.io.*;
public class Exception1
{
	public static void main(String args[])
	{
		try
		{
			//code that may raise exception
			int data=100/0;
		}catch(ArithmeticException e)
		{
			//System.out.println("Exception Occured");
			System.out.println(e);
			//System.out.println(e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	//rest code of the program
	System.out.println("rest of the code...");
	}
}
