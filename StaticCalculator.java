package Practice;

public class StaticCalculator {
	static int add(int a, int b) {
        return a+b;
    }
    
    static int multiply(int a, int b) {
        return a*b;
    }
    
    void display() {
        System.out.println("Instance method called");
    }
}