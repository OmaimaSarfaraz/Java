package Practice;
import java.util.Scanner;

public class VowelCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch=sc.next().charAt(0);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("Vowel");
		else 
			System.out.println("Consonant");
	}
}