package Practice;
import java.util.Scanner;
import java.util.Random;

public class MagicNumberGuess {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int secret=rand.nextInt(20)+1;
		System.out.println("Welcome to the Magic Number Guess Game!");
		System.out.println("I am thinking of a number between 1 and 20.");
		System.out.println("Here's a clue: Twice my number plus 3 is "+(secret*2+3));
		int attempts=0;
		while(true) {
			System.out.print("Your guess: ");
			int guess=sc.nextInt();
			attempts++;
			if(guess==secret) {
				System.out.println("Correct! You found the magic number in "+attempts+" attempts!");
				break;
			} else if(guess<secret) {
				System.out.println("Too low! Try again.");
			} else {
				System.out.println("Too high! Try again.");
			}
		}
	}
}