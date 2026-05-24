package Practice;
import java.util.*;

public class Emojify {
    public static void main(String[] args) {
        Map<String, String> emojiMap = new HashMap<>();
        emojiMap.put("happy", "😊");
        emojiMap.put("sad", "😢");
        emojiMap.put("love", "❤️");
        emojiMap.put("cool", "😎");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine().toLowerCase();

        for (String word : emojiMap.keySet()) {
            input = input.replace(word, emojiMap.get(word));
        }

        System.out.println("Emojified: " + input);
    }
}