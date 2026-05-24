package Practice;

public class Counter {
	static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Number of objects created: " + count);
    }
}