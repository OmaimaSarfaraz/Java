package Lab11;

public class MultipleTimers extends Thread{
	public void run(){
			try {
			    sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("First Timer Finished");
	}
	public void run1(){
		try {
		    sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Second Timer Finished");
    }
	public void run2(){
		try {
		    sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Last Timer Finished");
    }	
}