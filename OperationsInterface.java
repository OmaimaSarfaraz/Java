package Lab07;

public interface OperationsInterface{
	default void add(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	default void sub(int a, int b) {
		System.out.println("Subtraction: "+(a-b));
	}
	default void mul(int a, int b) {
		System.out.println("Multiplication: "+(a*b));
	}
	default void div(int a, int b) {
		System.out.println("Division: "+(a/b));
	}
}