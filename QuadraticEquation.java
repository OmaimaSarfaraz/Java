package Practice;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter coefficient a: ");
		double a=sc.nextDouble();
		System.out.print("Enter coefficient b: ");
		double b=sc.nextDouble();
		System.out.print("Enter coefficient c: ");
		double c=sc.nextDouble();
		double d=b*b-4*a*c;
		if(d>0){
			double x1=(-b+Math.sqrt(d))/(2*a);
			double x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The roots are real and distinct.");
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
			}
		else if(d==0){
			double x=-b/(2*a);
			System.out.println("The root is real and repeated.");
			System.out.println("x = "+x);
			}
		else{
			System.out.println("The equation has no real roots.");
			}
	}
}