import java.io.File;

class File2
{
	public static void main(String[] args)
	{
		try {
			File f1=new File("xyz1.txt");
			f1.createNewFile();
			System.out.println("Is file exist: "+ f1.exists());
		}
		catch (Exception e) {
			System.out.println("caught");
		}
	}
}
