package Practice;

public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60,b=7;
		System.out.println("Sum: "+sum(a,b));
		System.out.println("Difference: "+difference(a,b));
		System.out.println("Product: "+product(a,b));
		System.out.println("Quotient: "+quotient(a,b));
		System.out.println("Remainder: "+remainder(a,b));
	}
	static int sum(int x,int y){
		return x+y;
		}
	static int difference(int x,int y){
		return x-y;
		}
	static int product(int x,int y){
		return x*y;
		}
	static int quotient(int x,int y){
		return x/y;
		}
	static int remainder(int x,int y){
		return x%y;
		}
}
