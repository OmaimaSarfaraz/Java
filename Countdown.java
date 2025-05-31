package Practice;
import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to countdown from: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--) {
            System.out.println("⏳ "+i);
            try {
            	Thread.sleep(500);
            	} 
            catch(Exception e) {
            	
            }
        }
        System.out.println("🚀 Countdown Complete!");
	}
}