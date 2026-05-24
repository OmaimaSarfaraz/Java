package Practice;
import java.util.Random;
import java.util.Scanner;

public class WeatherBot {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String[]conditions={"Sunny","Rainy","Cloudy","Stormy","Windy","Snowy"};
        int temp=new Random().nextInt(30)+10;

        System.out.print("Enter your city: ");
        String city=sc.nextLine();

        String weather=conditions[new Random().nextInt(conditions.length)];
        System.out.println("📍 Weather in "+city+": "+weather+", "+temp+"°C");
        sc.close();
    }
}