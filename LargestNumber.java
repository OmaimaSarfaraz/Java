package Practice;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Largest: "+(a>b?(a>c?a:c):(b>c?b:c)));
        sc.close();
	}
}