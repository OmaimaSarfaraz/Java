package Practice;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String playerChoice = input.nextLine();

        int randomIndex = random.nextInt(3);
        String computerChoice = choices[randomIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a Tie!");
        } else if (
                (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("🎉 You Win!");
        } else {
            System.out.println("❌ You Lose!");
        }

        input.close();
    }
}