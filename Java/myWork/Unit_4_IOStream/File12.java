//Writing in a file using BufferedWriter

import java.io.*;
class File12
{
	public static void main(String[] args) throws IOException
	{
		FileWriter f= new FileWriter("./xyz.txt"); //Writer->class, FileWriter->subclass
		BufferedWriter b=new BufferedWriter(f);
		b.write("VIT");
		b.close();
	}
}
