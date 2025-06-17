package Practice;

public class MainRobo {

	public static void main(String[] args) {
		        Robots t;                

		        t=new CleaningRobot(); 
		        t.start();
		        t.performTask();
		        t.stop();

		        System.out.println();

		        t=new DeliveryRobot(); 
		        t.start();
		        t.performTask();
		        t.stop();
	}
}