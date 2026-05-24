package loops;
import java.util.Scanner;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter today's temperature (°C): ");
        int temp=sc.nextInt();
        System.out.print("Enter day number (1=Mon, 7=Sun): ");
        int day=sc.nextInt();
        
        if(temp>40){
            System.out.println("🔥 It's extremely hot. Stay hydrated!");
        } else if(temp>=30){
            System.out.println("☀️ It's sunny and warm. Wear light clothes.");
        } else if(temp>=20){
            System.out.println("🌤️ Pleasant weather. Perfect for a walk.");
        } else if(temp>=10){
            System.out.println("🧥 It's chilly. Wear a jacket.");
        } else {
            System.out.println("❄️ It's cold! Stay indoors if possible.");
        }

        switch(day){
            case 6:
            case 7:
            	System.out.println("🎉 It's the weekend! Relax and recharge.");
                break;
            case 1:System.out.println("📅 Start of the week. Set your goals!");
                break;
            default:System.out.println("📚 It's a weekday. Stay productive!");
        }

        System.out.print("Forecast (next 3 days): ");
        for(int i=1;i<=3;i++){
            System.out.print((temp-i*2)+"°C ");
        }
	}
}