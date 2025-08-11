package Practice;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        System.out.println("🎲 Dice 1: " + dice1);
        System.out.println("🎲 Dice 2: " + dice2);
        System.out.println("Total: " + (dice1 + dice2));
    }
}