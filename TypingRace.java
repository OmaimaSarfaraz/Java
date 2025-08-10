package Practice;

public class TypingRace {
    public static void main(String[] args) throws InterruptedException {
        String sentence = "I will become a Java master!";
        for (char c : sentence.toCharArray()) {
            System.out.print(c);
            Thread.sleep(100);
        }
    }
}