package Practice;
import java.util.Scanner;

public class EchoBot {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Say something: ");
        String input=sc.nextLine();
        String reverse="";

        for(int i=input.length()-1;i>=0;i--) {
            reverse+=input.charAt(i);
        }

        System.out.println("🤖 EchoBot: "+reverse);
        sc.close();
    }
}