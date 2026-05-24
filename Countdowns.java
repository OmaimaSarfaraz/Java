package Practice;

import java.util.Scanner;

public class Countdowns
{
    public static void main(String[]args)throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Countdown from: ");
        int n=sc.nextInt();

        for(int i=n;i>=0;i--) {
            System.out.println("⏳ "+i+"...");
            Thread.sleep(1000); // 1 second delay
        }

        System.out.println("🚀 Time's up!");
        sc.close();
    }
}