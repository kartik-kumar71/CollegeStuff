//Reading from file using BufferedReader


import java.io.*;
class File14
{
	public static void main(String[] args) throws IOException
	{
		FileReader f= new FileReader("./xyz.txt"); //Writer->class, FileWriter->subclass
		BufferedReader b=new BufferedReader(f);
		int ch;
		while ((ch=b.read())!=-1)
			System.out.print((char)ch);
		b.close();
	}
}
