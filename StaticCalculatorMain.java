package Practice;

public class StaticCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum: " + StaticCalculator.add(5, 3));
        System.out.println("Product: " + StaticCalculator.multiply(4, 6));

        StaticCalculator obj = new StaticCalculator();
        obj.display();
	}
}