package Practice;
import java.util.Scanner;

public class RiddleGame {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("🧠 Riddle: What has keys but can't open locks?");
        System.out.print("Your answer: ");
        String ans=sc.nextLine().toLowerCase();

        if(ans.contains("piano")) {
            System.out.println("🎉 Correct!");
        } else {
            System.out.println("❌ Nope! The answer was: Piano 🎹");
        }

        sc.close();
    }
}