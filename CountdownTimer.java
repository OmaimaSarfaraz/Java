package Lab11;

public class CountdownTimer extends Thread{
	public void run(){
		for(int i=10;i>=1;i--) {
			System.out.println(i);
			try {
			    sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}