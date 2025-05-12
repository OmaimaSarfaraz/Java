package Practice;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> names=new LinkedList<>();
        names.add("Ali");
        names.add("Sara");
        names.add("Salar");
        System.out.println("Names: "+names);
        names.remove("Sara");
        System.out.println("After removing Sara: " + names);
	}
}