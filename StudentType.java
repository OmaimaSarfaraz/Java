package Practice;
import java.util.Scanner;

public class StudentType {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int score=0;

        System.out.println("🎓 What Kind of Student Are You?");
        System.out.println("Answer 1, 2 or 3\n");

        System.out.println("1. How do you prepare for exams?");
        System.out.println("1) Weeks before");
        System.out.println("2) Night before");
        System.out.println("3) Just vibe");
        score+=sc.nextInt();

        System.out.println("\n2. Your desk looks like...");
        System.out.println("1) Organized & labeled");
        System.out.println("2) Slight chaos");
        System.out.println("3) What desk?");
        score+=sc.nextInt();

        System.out.println("\n3. Your motivation level?");
        System.out.println("1) I love learning!");
        System.out.println("2) GPA is life");
        System.out.println("3) We'll see what happens");
        score+=sc.nextInt();

        System.out.println("\n📚 Result:");

        if(score<=5) {
            System.out.println("🧠 The Topper: Focused, consistent & caffeine-powered!");
        } else if(score<=7) {
            System.out.println("📅 The Hustler: Last-minute but still aces it!");
        } else {
            System.out.println("😴 The Survivor: Here for vibes & attendance marks.");
        }

        sc.close();
    }
}