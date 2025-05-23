package Lab11;
import java.time.LocalTime;


public class ClockDisplay extends Thread{
	LocalTime time;
	public void run(){
		while(true)
		{
			time=LocalTime.now();
			System.out.println("Current time is "+time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}