package files;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
            FileWriter fw = new FileWriter("example.txt");
            fw.write("Hello, I am writing the content for the file.");
            fw.close();
            System.out.println("File written successfully.");
        } 
		catch (IOException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
	}
}