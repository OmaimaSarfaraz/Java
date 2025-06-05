package Thread;

public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadth t1=new Threadth();
		Threadth t2=new Threadth();
	        t1.setName("Thread A");
	        t2.setName("Thread B");
	        t1.start();
	        t2.start();
	}
}