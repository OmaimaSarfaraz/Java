package Practice;
import java.util.Scanner;

public class AgeCategory {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		if(age<18)
			System.out.println("You are a child.");
		else if(age<65)
			System.out.println("You are an adult.");
		else 
			System.out.println("You are a senior citizen.");
		}
}