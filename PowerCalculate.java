package Lab06;
import java.util.Scanner;

public class PowerCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Base: ");
		double base=input.nextDouble();
		System.out.print("Enter a Exponent: ");
		double exp=input.nextDouble();
		System.out.println("Power result: "+Math.pow(base, exp));
	}
}