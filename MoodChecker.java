package Practice;
import java.util.*;

public class MoodChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How are you feeling today? (happy/sad/angry): ");
        String mood=sc.next().toLowerCase();
        switch(mood){
            case "happy":
            	System.out.println("😊 Keep smiling!");
            	break;
            case "sad":
            	System.out.println("😢 It’s okay. Better days ahead!");
            	break;
            case "angry":
            	System.out.println("😠 Take a deep breath. You've got this!");
            	break;
            default:
            	System.out.println("🤔 Mood not recognized, but I hope you’re doing okay!");
        }
    }
}
