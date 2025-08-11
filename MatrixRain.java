package Practice;
import java.util.Random;

public class MatrixRain {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.print(rand.nextInt(2) + " ");
            }
            System.out.println();
            Thread.sleep(50);
        }
    }
}