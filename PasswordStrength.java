package Practice;
import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pwd = sc.nextLine();

        int score = 0;
        if(pwd.length() >= 8) score++;
        if(pwd.matches(".*\\d.*")) score++;
        if(pwd.matches(".*[a-z].*") && pwd.matches(".*[A-Z].*")) score++;
        if(pwd.matches(".*[!@#$%^&*()].*")) score++;

        switch(score) {
            case 4 -> System.out.println("🔐 Very Strong");
            case 3 -> System.out.println("💪 Strong");
            case 2 -> System.out.println("🙂 Medium");
            default -> System.out.println("⚠️ Weak");
        }
    }
}