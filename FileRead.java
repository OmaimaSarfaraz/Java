package files;
import java.io.File;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
            File file = new File("example.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
		catch (Exception e)
		{
            System.out.println("Error: " + e.getMessage());
        }
	}
}