package Lab06;
import java.util.Scanner;

public class MaximumofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Three Numbers: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		System.out.println("Largest: "+Math.max(a,Math.max(b,c)));
	}
}