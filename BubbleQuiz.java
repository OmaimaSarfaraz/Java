package Practice;
import java.util.Scanner;

public class BubbleQuiz {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int score=0;

        System.out.println("🧋 Which Boba Flavor Matches You?");
        System.out.println("Pick 1, 2, or 3\n");

        System.out.println("1. Your energy level?");
        System.out.println("1) Calm");
        System.out.println("2) Bubbly");
        System.out.println("3) Chaotic");
        score+=sc.nextInt();

        System.out.println("\n2. Go-to aesthetic?");
        System.out.println("1) Cozy & soft");
        System.out.println("2) Bright & bold");
        System.out.println("3) Dark & edgy");
        score+=sc.nextInt();

        System.out.println("\n3. What's your vibe?");
        System.out.println("1) Chill friend");
        System.out.println("2) Life of the party");
        System.out.println("3) Deep thinker");
        score+=sc.nextInt();

        System.out.println("\n🧋 Result:");

        if(score<=5) {
            System.out.println("🧋 You're Classic Milk Tea — reliable, warm & everyone's favorite!");
        } else if(score<=7) {
            System.out.println("🍓 You're Strawberry Boba — fun, sweet & super cute!");
        } else {
            System.out.println("🌑 You're Charcoal Boba — mysterious & unforgettable!");
        }

        sc.close();
    }
}