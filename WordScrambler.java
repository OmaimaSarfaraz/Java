package Practice;

import java.util.Scanner;
import java.util.Random;

public class WordScrambler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"java", "programming", "developer", "computer", "keyboard"};
        Random random = new Random();

        String originalWord = words[random.nextInt(words.length)];
        String scrambledWord = scrambleWord(originalWord);

        System.out.println("Guess the word: " + scrambledWord);

        System.out.print("Your guess: ");
        String guess = input.nextLine();

        if (guess.equalsIgnoreCase(originalWord)) {
            System.out.println("✅ Correct! Well done.");
        } else {
            System.out.println("❌ Wrong! The word was: " + originalWord);
        }

        input.close();
    }

    static String scrambleWord(String word) {
        char[] letters = word.toCharArray();
        Random random = new Random();

        for (int i = 0; i < letters.length; i++) {
            int j = random.nextInt(letters.length);
            // Swap
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
}