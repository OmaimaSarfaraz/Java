package Practice;
import java.util.Random;

public class ComplimentMe {
    public static void main(String[]args) {
        String[]compliments={
            "You have a lovely smile 😊",
            "You're doing amazing!",
            "You're full of good vibes 🌈",
            "You're smarter than you think!",
            "You're a walking sunshine ☀️"
        };

        int pick=new Random().nextInt(compliments.length);
        System.out.println("💌 "+compliments[pick]);
    }
}