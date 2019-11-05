import java.io.*;
class File6
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileOutputStream out;
		out=new FileOutputStream("xyz.txt");
		String s= "VIT Bhopal";
		char ch[]=s.toCharArray();
		for (i=0;i<s.length();i++)
			out.write(ch[i]);
		out.close();
	}
}
