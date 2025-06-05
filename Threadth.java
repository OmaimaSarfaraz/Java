package Thread;

public class Threadth extends Thread{
	public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(getName()+" → "+i);
            try {Thread.sleep(500);} catch(Exception e) {}
        }
    }
}