package Practice;
import java.util.Scanner;

public class MathRiddle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Math Riddle!");
		System.out.println("Riddle: I am a number. Multiply me by 4 and add 6, you get 30. What am I?");
		System.out.print("Your guess: ");
		int guess=sc.nextInt();
		if(guess*4+6==30) {
			System.out.println("Correct! Well done.");
		} else {
			System.out.println("Wrong! The answer was "+((30-6)/4)+".");
		}
	}
}