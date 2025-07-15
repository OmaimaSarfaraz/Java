package Practice;
import java.util.Scanner;

public class HiddenCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decode this: 83 72 65 68 79 87 ➡ ");
        String guess = sc.nextLine().toUpperCase();
        if(guess.equals("SHADOW")) 
        	System.out.println("🧠 Correct!");
        else 
        	System.out.println("❌ Try again.");
        sc.close();
    }
}