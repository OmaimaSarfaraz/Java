package Thread;

class Task extends Thread{
	public void run() {
        for(int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName()+" working...");
            try {
            	Thread.sleep(400);
            	} 
            catch(Exception e) {
            	
            }
        }
    }
}