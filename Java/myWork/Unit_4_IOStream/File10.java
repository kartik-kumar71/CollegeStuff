import java.io.*;
class File10
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream in;
		in=new FileInputStream("xyz.txt");
		int i= in.read();
		while (i!=-1) 
		{
			System.out.print(i+" ");
			i= in.read();
		}
	}
}
