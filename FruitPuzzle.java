package Practice;
import java.util.Scanner;

public class FruitPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fruits = {"APPLE", "MANGO", "BANANA", "GRAPE", "PEACH"};
        String[] hints = {
            "A _ _ L E", 
            "M _ _ G O", 
            "B _ _ A _ A",
            "G _ _ P E",    
            "P _ _ C H"    
        };

        System.out.println("Guess the fruit name from the hint:");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Hint: " + hints[i]);
            System.out.print("Your guess: ");
            String guess = sc.nextLine().toUpperCase();

            if (guess.equals(fruits[i])) {
                System.out.println("✅ Correct!\n");
            } else {
                System.out.println("❌ Wrong! The correct answer was: " + fruits[i] + "\n");
            }
        }

        System.out.println("Game Over! 🍎🍌🍇");
        sc.close();
    }
}