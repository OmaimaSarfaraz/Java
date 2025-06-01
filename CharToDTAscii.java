package dataTypes;
import java.util.Scanner;

public class CharToDTAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        int ascii=ch; 
        System.out.println("ASCII value of '"+ch+"' is: "+ascii);
	}
}