package Practice;
import java.util.Scanner;

public class MainSearchUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookSearchUpdate[] books = {
	            new BookSearchUpdate("The Alchemist", "Paulo Coelho", 1988),
	            new BookSearchUpdate("1984", "George Orwell", 1949),
	            new BookSearchUpdate("Clean Code", "Robert Martin", 2008)
	        };

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter book title to search: ");
	        String searchTitle = sc.nextLine();

	        boolean found = false;
	        for (BookSearchUpdate b : books) {
	            if (b.title.equalsIgnoreCase(searchTitle)) {
	                System.out.println("Book found:");
	                b.display();
	                found=true;

	                System.out.print("Enter new author name to update: ");
	                String newAuthor=sc.nextLine();
	                b.author=newAuthor;
	                System.out.println("Updated Book:");
	                b.display();
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Book not found.");
	        }
	}
}