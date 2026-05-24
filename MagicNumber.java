package loops;
import java.util.*;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int secret=rand.nextInt(100)+1;
        int guess=0, tries=0;
        System.out.println("🎯 Guess the Magic Number between 1 and 100!");

        while(guess!=secret){
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            tries++;
            if(guess<secret)
            	System.out.println("🔼 Too low!");
            else if(guess>secret)
            	System.out.println("🔽 Too high!");
            else 
            	System.out.println("🎉 Correct! You guessed it in "+tries+" tries.");
        }
    }
}