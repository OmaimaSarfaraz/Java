package Practice;

public class OverloadAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(5,3));
		System.out.println(add(2.5,4.5));
		}
	static int add(int a,int b){
		return a+b;
		}
	static double add(double a,double b){
		return a+b;
		}
}