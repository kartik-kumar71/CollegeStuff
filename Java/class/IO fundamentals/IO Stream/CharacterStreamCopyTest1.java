 import java.io.*;
 public class CharacterStreamCopyTest1 
 {
	public static void main(String[] args) throws IOException
	{
		char[] c = new char[500]; 
         // Example use of InputStream methods
         try (FileReader fr = new FileReader(args[0]);
              FileWriter fw = new FileWriter(args[1])) 
			{
				int count = 0;
				int read = 0;
				while ((read = fr.read(c)) != -1) 
				{
					fw.write(c);
					count += read;
				}
				System.out.println("Wrote: " + count + " characters.");
			}catch (FileNotFoundException f) {
				System.out.println("File " + args[0] + " not found.");
			}catch (IOException e) {
				System.out.println("IOException: " + e);
			}
     }
 }
