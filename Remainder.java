package Practice;
import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("Remainder: "+(a%b));
	}
}