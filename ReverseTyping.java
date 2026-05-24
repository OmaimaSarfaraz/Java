package Practice;

public class ReverseTyping {
    public static void main(String[] args) throws InterruptedException {
        String text = "Goodbye, World!";
        for (int i = text.length(); i >= 0; i--) {
            System.out.print("\r" + text.substring(0, i) + " ");
            Thread.sleep(200);
        }
    }
}