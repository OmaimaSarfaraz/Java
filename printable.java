package Practice;

public interface printable {
	default void print() {
		System.out.println("Method");
	}
}