package Practice;
import java.util.Random;

public class CurrencyFlipper {
    public static void main(String[] args) {
        Random rand = new Random();
        double pkr = rand.nextInt(5000) + 100;
        double usdRate = 0.0036;
        double eurRate = 0.0033;
        System.out.printf("PKR %.2f = USD %.2f | EUR %.2f\n", pkr, pkr * usdRate, pkr * eurRate);
    }
}