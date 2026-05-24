package Practice;
import java.util.*;

public class ColorCracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] colors={"RED","BLUE","GREEN","PINK","BLACK","WHITE"};
        Random rand=new Random();
        String secret=colors[rand.nextInt(colors.length)];
        int attempts=3;

        System.out.println("🎨 Guess the hidden color (in UPPERCASE). You have 3 tries!");

        while(attempts>0) {
            System.out.print("Enter your guess: ");
            String guess=sc.nextLine().toUpperCase();

            if(guess.equals(secret)) {
                System.out.println("🎉 Correct! The color was: "+secret);
                break;
            } else {
                attempts--;
                System.out.println("❌ Wrong! Attempts left: "+attempts);

                if(attempts==2) {
                    System.out.println("🧩 Hint: The color starts with '"+secret.charAt(0)+"'");
                } else if(attempts==1) {
                    System.out.println("🧩 Hint: Color has "+secret.length()+" letters");
                }
            }
        }

        if(attempts==0) {
            System.out.println("💀 Out of attempts! The color was: "+secret);
        }

        sc.close();
    }
}