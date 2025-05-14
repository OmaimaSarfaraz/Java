package Lab10;
import java.util.LinkedList;

public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a=new LinkedList<>();
		a.add("Audi");
		a.add("BMW");
		a.add("Ferrari");
		System.out.println("List of cars: ");
		for(String car: a) {
			System.out.println(car);
		}
		a.add(0,"Mercedes");
		a.add("Picanto");
		System.out.println("List of cars After Adding: ");
		for(String car: a) {
			System.out.println(car);
		}
		a.remove(4);
		System.out.println("List of cars After Removing: ");
		for(String car: a) {
			System.out.println(car);
		}
	}
}