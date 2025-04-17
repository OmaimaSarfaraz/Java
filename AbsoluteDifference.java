package Lab06;
import java.util.Scanner;

public class AbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=input.nextInt();
		System.out.print("Enter a Number: ");
		int num2=input.nextInt();
		System.out.println("Absolute difference: "+Math.abs(num-num2)); 
	}
}