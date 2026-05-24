package Practice;
import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=cs.nextInt(),fact=1;
		for(int i=1;i<=num;i++)
			{
			fact*=i;
			}
		System.out.println("Factorial: "+fact);
	}
}