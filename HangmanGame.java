package Practice;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String word="BANANA";
        char[] guessed=new char[word.length()];
        for(int i=0;i<guessed.length;i++) {
            guessed[i]='_';
        }

        int attempts=6;
        boolean won=false;

        while(attempts>0) {
            System.out.print("Word: ");
            for(char c:guessed) {
                System.out.print(c+" ");
            }

            System.out.print("\nGuess a letter: ");
            char guess=sc.next().toUpperCase().charAt(0);

            boolean correct=false;

            for(int i=0;i<word.length();i++) {
                if(word.charAt(i)==guess && guessed[i]=='_') {
                    guessed[i]=guess;
                    correct=true;
                }
            }

            if(!correct) {
                attempts--;
                System.out.println("❌ Wrong! Attempts left: "+attempts);
            } else {
                System.out.println("✅ Good guess!");
            }

            if(new String(guessed).equals(word)) {
                won=true;
                break;
            }
        }

        if(won) {
            System.out.println("\n🎉 Congratulations! You guessed the word: "+word);
        } else {
            System.out.println("\n💀 Out of attempts! The word was: "+word);
        }

        sc.close();
    }
}
