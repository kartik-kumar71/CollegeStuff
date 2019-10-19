import java.io.*;
class ByteStreamCopyTest
{
	public static void main(String args[]) throws IOException
	{  
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in = new FileInputStream("Stream.gif");
			//in = new FileInputStream("C:\\test\\a.txt");
			out = new FileOutputStream("output.txt");
			//out = new FileOutputStream("output.gif");
            int c;
			while ((c = in.read()) != -1) 
			{
				out.write(c);
			}
		}
		finally
		{
			if (in != null) 
			{
				in.close();
			}
			if (out != null)
			{
				out.close();
			}
		}
	}
}