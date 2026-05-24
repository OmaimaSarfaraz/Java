package Practice;
import java.util.Scanner;

public class MathMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a 3-digit number (first and last digits should differ by at least 2):");
        int num = sc.nextInt();

        int reverse = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
        int diff = Math.abs(num - reverse);
        int finalResult = diff + Integer.parseInt(new StringBuilder(String.valueOf(diff)).reverse().toString());

        System.out.println("✨ Your magic number is: " + finalResult);
        sc.close();
    }
}