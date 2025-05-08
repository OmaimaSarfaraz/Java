package files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SpecificDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
            String directoryPath = "D:/FileHandling"; 
            String fileName = "data.txt";
            
            File dir = new File(directoryPath);
            dir.mkdirs();

            FileWriter fw = new FileWriter(directoryPath + "/" + fileName);
            fw.write("This file was saved in a specific directory.");
            fw.close();

            System.out.println("File saved to: " + directoryPath + "/" + fileName);
        }
		catch (IOException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
	}
}