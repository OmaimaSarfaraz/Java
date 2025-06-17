package Practice;

public interface Robots {
	void start();
    void stop();
    void performTask();
}
class CleaningRobot implements Robots {
    public void start() {
        System.out.println("Cleaning Robot starting...");
    }

    public void stop() {
        System.out.println("Cleaning Robot stopping...");
    }

    public void performTask() {
        System.out.println("Cleaning in progress...");
    }
}

class DeliveryRobot implements Robots {
    public void start() {
        System.out.println("Delivery Robot starting...");
    }

    public void stop() {
        System.out.println("Delivery Robot stopping...");
    }

    public void performTask() {
        System.out.println("Delivering package...");
    }
}