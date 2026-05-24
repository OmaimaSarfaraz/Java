package Practice;
import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base: ");
		int a=sc.nextInt();
		System.out.print("Enter exponent: ");
		int b=sc.nextInt();
		System.out.println("Result: "+Power(a,b));
		}
	static int Power(int a,int b){
		int result=1;
		for(int i=1;i<=b;i++){
			result*=a;
			}
		return result;
	}
}