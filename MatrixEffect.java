package Practice;

public class MatrixEffect {
    public static void main(String[] args) throws InterruptedException {
        String chars = "01";
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.print(chars.charAt((int)(Math.random() * chars.length())));
            }
            System.out.println();
            Thread.sleep(100);
        }
    }
}