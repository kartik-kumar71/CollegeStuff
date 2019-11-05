//Writing in  a file using BufferedWriter

import java.io.*;
class File13
{
	public static void main(String[] args) throws IOException
	{
		FileWriter f= new FileWriter("./xyz.txt",true); //Writer->class, FileWriter->subclass
		BufferedWriter b=new BufferedWriter(f);
		b.write(" Bhopal");
		b.close();
	}
}
