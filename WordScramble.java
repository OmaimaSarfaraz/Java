package Practice;
import java.util.*;

public class WordScramble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] words={"MANGO","APPLE","BANANA","ORANGE","GRAPES"};

        Random rand=new Random();
        String original=words[rand.nextInt(words.length)];
        List<Character> letters=new ArrayList<>();
        for(char c:original.toCharArray()) {
            letters.add(c);
        }

        Collections.shuffle(letters);
        System.out.print("Guess the word: ");
        for(char c:letters) {
            System.out.print(c+" ");
        }

        System.out.print("\nYour guess: ");
        String guess=sc.nextLine().toUpperCase();

        if(guess.equals(original)) {
            System.out.println("🎉 Correct! You win!");
        } else {
            System.out.println("❌ Wrong! The word was: "+original);
        }

        sc.close();
    }
}