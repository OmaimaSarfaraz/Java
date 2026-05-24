package Lab11;

public class CharacterPrinter extends Thread{
	public void run(){
		 for (char ch='A';ch<='E';ch++) {
	            System.out.println(ch);
	        }
	}
}