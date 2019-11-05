import java.io.*;

class File8
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream in;
		in=new FileInputStream("xyz.txt");
		int i;
		do {
			i= in.read();
			if (i!=-1)
				System.out.print((char)i);
			} while (i!=-1);
	}
}
