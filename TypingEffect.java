package Practice;

public class TypingEffect {
    public static void main(String[] args) throws InterruptedException {
        String msg = "Welcome to the Secret Console...";
        for(char c : msg.toCharArray()){
            System.out.print(c);
            Thread.sleep(100);
        }
        System.out.println("\nAccess Granted ✅");
    }
}