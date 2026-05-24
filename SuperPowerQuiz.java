package Practice;
import java.util.Scanner;

public class SuperPowerQuiz {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int score=0;

        System.out.println("🧞 What Superpower Matches Your Soul?");
        System.out.println("Choose wisely: 1, 2 or 3\n");

        System.out.println("1. Pick a place:");
        System.out.println("1) Sky");
        System.out.println("2) Forest");
        System.out.println("3) Stars");
        score+=sc.nextInt();

        System.out.println("\n2. Choose a strength:");
        System.out.println("1) Calm mind");
        System.out.println("2) Fierce energy");
        System.out.println("3) Imagination");
        score+=sc.nextInt();

        System.out.println("\n3. People say you are:");
        System.out.println("1) Supportive");
        System.out.println("2) Powerful");
        System.out.println("3) Mysterious");
        score+=sc.nextInt();

        System.out.println("\n🔮 Your Power Is:");

        if(score<=5) {
            System.out.println("🌬️ Telepathy — You understand people without words.");
        } else if(score<=7) {
            System.out.println("🔥 Fire Control — You're bold, passionate & unstoppable.");
        } else {
            System.out.println("✨ Time Bending — You live in your own magical rhythm.");
        }

        sc.close();
    }
}