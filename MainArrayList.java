package Practice;
import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Grapes");
	        fruits.add("Orange");
	        fruits.add("Mango");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	}
}