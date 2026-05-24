package functions;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidFunction.greet();
		System.out.println(ReturnFunction.getMessage());
		ParameterFunction.sum(50,10);
		System.out.println(ParameterReturnFunction.multiply(32,5));
	}
}