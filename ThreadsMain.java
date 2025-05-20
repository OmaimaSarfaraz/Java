package Thread;

public class ThreadsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("My Main: "+i);
		}
	}
}