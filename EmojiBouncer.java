package Practice;

public class EmojiBouncer {
    public static void main(String[] args) throws InterruptedException {
        String emoji = "😊";
        int pos = 0, dir = 1;
        while (true) {
            System.out.print("\r" + " ".repeat(pos) + emoji);
            Thread.sleep(100);
            pos += dir;
            if (pos == 20 || pos == 0) dir *= -1;
        }
    }
}