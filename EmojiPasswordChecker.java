package Practice;
import java.util.Scanner;

public class EmojiPasswordChecker {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password=sc.nextLine();

        if(password.matches(".*\\p{So}.*")) {
            System.out.println("🔒 Strong! Emoji detected in password.");
        } else {
            System.out.println("⚠️ Try adding an emoji to make it more fun and strong!");
        }

        sc.close();
    }
}