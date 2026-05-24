package Practice;
import java.util.*;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        int lucky=rand.nextInt(100)+1;
        System.out.println("🌟 Hello "+name+"! Your lucky number today is: "+lucky);
        if(lucky>80)
        	System.out.println("💥 A great day awaits you!");
        else if(lucky>50)
        	System.out.println("🙂 A decent day is coming.");
        else
        	System.out.println("😐 Stay calm and carry on.");
    }
}