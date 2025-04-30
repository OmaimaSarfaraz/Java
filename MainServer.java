package Server;
import java.io.*;
import java.net.*;

public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Create a server on port 5000
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            // Accept connection from client
            Socket client = server.accept();
            System.out.println("Client connected.");

            // Read message from client
            DataInputStream input = new DataInputStream(client.getInputStream());
            String msg = input.readUTF();  // Read string message
            System.out.println("Client says: " + msg);

            // Close everything
            input.close();
            client.close();
            server.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}