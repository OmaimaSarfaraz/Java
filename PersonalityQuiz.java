package Practice;
import java.util.Scanner;

public class PersonalityQuiz {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int score=0;

        System.out.println("🌟 What Type of Friend Are You? 🌟");
        System.out.println("Answer by typing 1, 2 or 3\n");

        System.out.println("1. What do you do when your friend is upset?");
        System.out.println("1) Listen quietly");
        System.out.println("2) Crack jokes");
        System.out.println("3) Give advice");
        score+=sc.nextInt();

        System.out.println("\n2. What’s your ideal weekend?");
        System.out.println("1) Watching movies at home");
        System.out.println("2) Partying with friends");
        System.out.println("3) Reading or exploring nature");
        score+=sc.nextInt();

        System.out.println("\n3. What’s your strength in a friend group?");
        System.out.println("1) Being there for everyone");
        System.out.println("2) Making people laugh");
        System.out.println("3) Solving conflicts");
        score+=sc.nextInt();

        System.out.println("\n🧠 Calculating your result...");

        if(score<=5) {
            System.out.println("🌸 You're 'The Soft Listener' — calm, caring & always there.");
        } else if(score<=7) {
            System.out.println("😂 You're 'The Clown' — full of energy & fun!");
        } else {
            System.out.println("🔥 You're 'The Leader' — confident, bold & dependable.");
        }

        sc.close();
    }
}