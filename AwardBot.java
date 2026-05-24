package Practice;
import java.util.Scanner;
import java.util.Random;

public class AwardBot {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String[]awards={
            "Most Likely to Survive a Zombie Apocalypse 🧟",
            "Best Laugh Award 😂",
            "Future Billionaire 💸",
            "Human Sunshine ☀️",
            "Snack Monster 🍫"
        };

        System.out.print("Enter friend's name: ");
        String name=sc.nextLine();
        int pick=new Random().nextInt(awards.length);
        System.out.println("🏆 "+name+" wins: "+awards[pick]);
        sc.close();
    }
}