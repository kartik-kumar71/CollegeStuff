import java.io.*;
public class KeyboardInput1
{
	public static void main(String[] args)throws IOException
	{
		/*Accepting Different type of Input(integer,float,double,short,
		long, byte, char, string, boolean) values from Keyboard*/
		Boolean bul=false;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string:");
		String str=br.readLine();
		System.out.println("Enter a integer:");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter float value:");
		Float ft=Float.parseFloat(br.readLine());
		System.out.println("Enter short value:");
		Short sht=Short.parseShort(br.readLine());
		System.out.println("Enter a Double value:");
		Double dub=Double.parseDouble(br.readLine());
		System.out.println("Enter a long value:");
		long log=Long.parseLong(br.readLine());
		System.out.println("Enter a Byte value:");
		Byte bit=Byte.parseByte(br.readLine());
		System.out.println("Enter a character:");
		char ch=(char)br.read();
		//Displaying values on console
		
        System.out.println("-------------------------");
        System.out.println("Entered Values are :");
        System.out.println("-------------------------");
		System.out.println("Integer value is: "+n);
		System.out.println("Float value is: "+ft);
		System.out.println("Short value is: "+sht);
		System.out.println("Double value is: "+dub);
		System.out.println("Long value is: "+log);
		System.out.println("Byte value is: "+bit);
		System.out.println("Character value is: "+ch);
		System.out.println("String value is: "+str);
		System.out.println("Boolean value is: "+bul);
  
	}
}