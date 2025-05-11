package Practice;
import java.util.*;

public class BooksStack {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Stack<String> books=new Stack<String>();
				books.push("Maths");
				books.push("Science");
				books.push("History");
				System.out.println("Top Book: "+books.peek());
				books.pop();
				System.out.println("Reamining Books: "+books);
	}
}