import java.io.File;
import java.io.IOException;

class File5
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("xyz1.txt");
		System.out.println("Is file exist: "+ f1.exists());
		f1.delete();
	}
}
