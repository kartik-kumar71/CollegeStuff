import java.io.*;
class File7
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileOutputStream out;
		out=new FileOutputStream("./xyz.txt",true);
		String s= " Madhya Pradesh";
		char ch[]=s.toCharArray();
		for (i=0;i<s.length();i++)
			out.write(ch[i]);
		out.close();
	}
}

