package Thread;

public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Task(), "Loader");
        Thread t2=new Thread(new Task(), "Downloader");
        t1.start();
        t2.start();
	}
}