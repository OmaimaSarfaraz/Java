package Practice;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
            System.out.print("Enter num1: ");
            int a = input.nextInt();
            System.out.print("Enter num2: ");
            int b = input.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
	}
}