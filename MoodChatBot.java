package Practice;
import java.util.Scanner;

public class MoodChatBot {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("You: ");
        String msg=sc.nextLine().toLowerCase();

        if(msg.contains("hi")||msg.contains("hello")) {
            System.out.println("Bot: Hey hey! 😊");
        } else if(msg.contains("sad")||msg.contains("tired")) {
            System.out.println("Bot: Sending you virtual hugs 🤗");
        } else if(msg.contains("?")) {
            System.out.println("Bot: Hmm... I'm still learning!");
        } else {
            System.out.println("Bot: Interesting! Tell me more!");
        }

        sc.close();
    }
}