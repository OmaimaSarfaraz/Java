package Lab10;
import java.util.LinkedList;

public class DeleteLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a=new LinkedList<>();
		a.add("Audi");
		a.add("BMW");
		a.add("Ferrari");
		a.add(0,"Mercedes");
		a.add("Picanto");
		System.out.println("List of cars: ");
		for(String car: a) {
			System.out.println(car);
		}
		a.remove(0);
		System.out.println("List of cars After Removing First: ");
		for(String car: a) {
			System.out.println(car);
		}
		a.remove(3);
		System.out.println("List of cars After Removing Last: ");
		for(String car: a) {
			System.out.println(car);
		}
	}
}