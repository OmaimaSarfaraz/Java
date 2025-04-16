package Lab06;
import java.util.Scanner;

public class SquareRootFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=input.nextInt();
		System.out.print("Square root of "+num+" is "+Math.sqrt(num));
	}
}