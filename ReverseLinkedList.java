package Lab10;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a=new LinkedList<>();
		a.add("Audi");
		a.add("BMW");
		a.add("Ferrari");
		a.add(0,"Mercedes");
		a.add("Picanto");
		System.out.println("List of cars: "+a);
		System.out.println("List of cars After Reverse:"+a.reversed());
	}
}