package Practice;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[]args) {
        String secretWord="LIKE"; 
        Scanner sc=new Scanner(System.in);
        int attempts=7;

        System.out.println("Welcome to the Word Guess Game!");
        System.out.println("Guess the 4-letter word. You have "+attempts+" tries.");

        while(attempts>0) {
            System.out.print("Enter your guess: ");
            String guess=sc.nextLine().toUpperCase();

            if(guess.length()!=4) {
                System.out.println("Please enter a 4-letter word.");
                continue;
            }

            if(guess.equals(secretWord)) {
                System.out.println("🎉 Correct! You guessed the word!");
                break;
            }

            // Provide feedback
            for(int i=0;i<4;i++) {
                char c=guess.charAt(i);
                if(c==secretWord.charAt(i)) {
                    System.out.print("✅ "); 
                } else if(secretWord.contains(Character.toString(c))) {
                    System.out.print("🟡 ");
                } else {
                    System.out.print("❌ ");
                }
            }
            System.out.println(); // New line for next guess

            attempts--;
        }

        if(attempts==0) {
            System.out.println("Game over! The word was: "+secretWord);
        }

        sc.close();
    }
}