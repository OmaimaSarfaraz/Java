package Practice;

public class BookSearchUpdate {
	String title;
    String author;
    int year;

    BookSearchUpdate(String t, String a, int y) {
        title=t;
        author=a;
        year=y;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}