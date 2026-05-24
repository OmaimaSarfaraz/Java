package Practice;

public interface showable {
	default void prints() {
		System.out.println("Another Method");
	}
}