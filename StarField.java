package Practice;

public class StarField {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            String line = "";
            for (int i = 0; i < 50; i++) {
                line += (Math.random() > 0.95) ? "*" : " ";
            }
            System.out.println(line);
            Thread.sleep(100);
        }
    }
}