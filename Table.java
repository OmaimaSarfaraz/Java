package Practice;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=a.nextInt();
		for(int i=1;i<=10;i++)
			{
			System.out.println(num+" x "+i+" = "+(num*i));
			}
	}
}