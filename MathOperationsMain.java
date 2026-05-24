package Practice;

public class MathOperationsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations calc = new MathOperations();
        System.out.println("Sum (2 int): " + calc.add(5, 10));
        System.out.println("Sum (3 int): " + calc.add(5, 10, 15));
        System.out.println("Sum (2 double): " + calc.add(2.5, 3.7));
	}
}