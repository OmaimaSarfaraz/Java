package Practice;
import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int smallest=a<b?(a<c?a:c):(b<c?b:c),largest=a>b?(a>c?a:c):(b>c?b:c);
	    System.out.println("Smallest: "+smallest+"\nLargest: "+largest);
	}
}