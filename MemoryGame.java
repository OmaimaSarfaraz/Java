package Practice;
import java.util.Random;
import java.util.Scanner;

public class MemoryGame {
    public static void main(String[]args)throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code="";

        for(int i=0;i<4;i++) {
            code+=chars.charAt(rand.nextInt(chars.length()));
        }

        System.out.println("Remember this code:");
        System.out.println(code);
        System.out.print("Memorizing");

        for(int i=0;i<3;i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }

        System.out.println();
        for(int i=0;i<30;i++) {
            System.out.println(); // clear screen by scrolling
        }

        System.out.print("Enter the code: ");
        String input=sc.nextLine().toUpperCase();

        if(input.equals(code)) {
            System.out.println("🎉 Correct! Great memory!");
        } else {
            System.out.println("❌ Oops! The correct code was: "+code);
        }

        sc.close();
    }
}