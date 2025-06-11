package Practice;
import java.util.Scanner;
import java.util.Random;

public class MathRRiddles {
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Random rand=new Random();
		int score=0;
		System.out.println("Welcome to the Math Riddle Game!");
		for(int i=1;i<=3;i++) {
			int a=rand.nextInt(10)+1;
			int b=rand.nextInt(10)+1;
			int c=rand.nextInt(5)+1;
			int result=a*b+c;
			System.out.println("Riddle "+i+": Find x. "+a+"*x+"+c+"="+result);
			System.out.print("Your guess for x: ");
			int guess=abc.nextInt();
			if(a*guess+c==result) {
				System.out.println("Correct!");
				score++;
			} else {
				System.out.println("Wrong! Answer was "+((result-c)/a));
			}
		}
		System.out.println("Game Over! Your score: "+score+"/3");
	}
}