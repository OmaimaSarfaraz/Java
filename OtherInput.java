package Java;

import java.util.Scanner;

public class OtherInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        float a,b;
        System.out.println("Enter Number: ");
        a=input.nextFloat();
        System.out.println("Enter Other Number: ");
        b=input.nextFloat();
        float res=a+b;
        System.out.println("Answer: "+res);
	}
}