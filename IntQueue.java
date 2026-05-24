package Practice;
import java.util.*;

public class IntQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<Integer>(); 
		q.add(10);
	    q.add(20);
	    q.add(30);
        System.out.println("Front of queue: " + q.peek());
        q.remove();
        System.out.println("Now Front of queue: " + q.peek());
	}
}