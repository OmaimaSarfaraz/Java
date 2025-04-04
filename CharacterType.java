package Practice;
import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch=sc.next().charAt(0);
		int ascii=(int)ch;
		if(ascii>=65 && ascii<=90)
			System.out.println("Capital Letter");
		else if(ascii>=97 && ascii<=122)
			System.out.println("Small Case Letter");
		else if(ascii>=48 && ascii<=57)
			System.out.println("Digit");
		else System.out.println("Special Symbol");
	}
}