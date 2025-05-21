package Lab11;

import java.io.IOException;

public class SimplePrinter extends Thread{
	public void run(){
		for(int i=1;i<=5;i++) {
			System.out.println("Hello from Thread "+i);
		}
	}
}