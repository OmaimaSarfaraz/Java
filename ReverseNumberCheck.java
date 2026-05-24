package Practice;
import java.util.Scanner;

public class ReverseNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a 5-digit number: ");
		int num=sc.nextInt(),rev=0,temp=num;
		while(temp!=0){
			rev=rev*10+temp%10;
			temp/=10;
			}
		System.out.println("Reversed Number: "+rev);
		System.out.println(num==rev?"The number is a palindrome.":"The number is not a palindrome.");
	}
}