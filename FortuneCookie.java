package Practice;
import java.util.Random;

public class FortuneCookie {
    public static void main(String[]args) {
        String[] fortunes={
            "You will make someone smile today 😊",
            "A big opportunity is on the way 🚀",
            "Be careful with your next decision 🧐",
            "You are stronger than you think 💪",
            "An old friend will message you soon 📩"
        };

        Random rand=new Random();
        int index=rand.nextInt(fortunes.length);
        System.out.println("🥠 Your fortune: "+fortunes[index]);
    }
}