package Practice;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1,15); 
        int value=numbers.get(2);
        int size=numbers.size();
        System.out.println("Numbers: "+numbers);
        System.out.println("Element at index 2: "+value);
        System.out.println("Size of list: "+size);
	}
}