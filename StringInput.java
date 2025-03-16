package Java;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        String s;
        System.out.println("Enter String: ");
        s=input.nextLine();
        System.out.println("String is: "+s);
	}
}