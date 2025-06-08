package dataTypes;
import java.util.Scanner;

public class TypeCastingLive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number (int): ");
        int num=sc.nextInt();
        System.out.println("\nCasting results:");
        byte b=(byte)num;
        short s=(short)num;
        long l=num;
        float f=num;
        double d=num;
        char c=(char)num;
        System.out.println("byte  → "+b);
        System.out.println("short → "+s);
        System.out.println("long  → "+l);
        System.out.println("float → "+f);
        System.out.println("double→ "+d);
        System.out.println("char  → "+c);
    }
}