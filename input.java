package Java;
import java.util.Scanner; 

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Number: ");
        a=input.nextInt();
        System.out.println("Enter Other Number: ");
        b=input.nextInt();
        int res=a+b;
        System.out.println("Answer: "+res);
	}
}