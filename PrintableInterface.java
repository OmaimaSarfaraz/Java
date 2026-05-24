package Lab07;

public interface PrintableInterface {
	default void print() {
		System.out.println("Printing...");
	}
}