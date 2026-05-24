package Practice;
import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        int years = sc.nextInt();
        int days = years * 365;
        System.out.println("You have lived about " + days + " days!");
    }
}