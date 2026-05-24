package Client;
import java.io.*;
import java.net.*;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		Socket socket = new Socket("localhost", 5000);  // connect to server

        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF("Hello Server!");
      //  output.writeUTF("Hello again");  // second message
        
        output.close();
        socket.close();
		}
		catch(Exception ex)
		{
			 System.out.println("Error: " + ex.getMessage());
		}
	}
}