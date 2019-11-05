import java.io.File;
import java.io.IOException;

class File4
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("xyz1.txt");
		f1.createNewFile();
		System.out.println("Is file exist: "+ f1.exists());
	}
}
