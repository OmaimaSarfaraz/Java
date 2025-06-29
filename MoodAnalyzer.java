package Practice;
import java.util.Scanner;

public class MoodAnalyzer {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How are you feeling today? ");
        String input=sc.nextLine().toLowerCase();

        if(input.contains("happy")||input.contains("excited")) {
            System.out.println("😊 You're feeling joyful! Keep smiling!");
        } else if(input.contains("sad")||input.contains("tired")) {
            System.out.println("😔 It's okay to feel down sometimes. Take care!");
        } else if(input.contains("angry")||input.contains("frustrated")) {
            System.out.println("😡 Deep breaths, everything will be okay.");
        } else {
            System.out.println("🤔 Can't quite tell, but I hope you're doing alright!");
        }
    }
}