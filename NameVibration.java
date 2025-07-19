package Practice;

public class NameVibration {
    public static void main(String[] args) throws InterruptedException {
        String name = "GULAABO";
        for (int i = 0; i < 20; i++) {
            int spaces = (int)(Math.random() * 20);
            System.out.println(" ".repeat(spaces) + name);
            Thread.sleep(200);
        }
    }
}