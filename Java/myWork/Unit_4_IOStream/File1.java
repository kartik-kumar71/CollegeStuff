import java.io.File;

class File1
{
	public static void main(String[] args)
	{
		File f1=new File("xyz.txt");
		System.out.println("Is file exist: "+ f1.exists());
		System.out.println("File name: "+ f1.getName());
		System.out.println("Can file read: "+ f1.canWrite());
		System.out.println("Length of the file: "+ f1.length());
	}
}
