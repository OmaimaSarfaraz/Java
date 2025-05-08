package files;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
            FileWriter fw = new FileWriter("example.txt", true);
            fw.write("Appended line.\n");
            fw.close();
            System.out.println("Content appended successfully.");
        } 
		catch (IOException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
	}
}