import java.io.*;
public class BufferedStreamCopyTest 
{
    public static void main(String[] args) throws IOException
	{
        try (BufferedReader bufInput 
                 = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bufOutput 
                 = new BufferedWriter(new FileWriter(args[1]))) {
            String line = "";
            while ((line = bufInput.readLine()) != null) {
                 bufOutput.write(line);
                 bufOutput.newLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("File not found: " + f);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}