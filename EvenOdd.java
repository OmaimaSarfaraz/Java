package Practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num=sc.nextInt();
		if(num%2==0)
			{
			System.out.println(num+" is Even");
			}
		else 
			{
			System.out.println(num+" is Odd");
		    }
         }
}