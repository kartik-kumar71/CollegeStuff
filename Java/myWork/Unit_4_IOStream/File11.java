import java.io.*;
class File11
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream in;
		in=new FileInputStream("xyz.txt");
		int i= in.read();
		while (i!=-1)
		{
			System.out.print((char)i+ " ");
			i= in.read();
		}
		in.close();
	}
}
