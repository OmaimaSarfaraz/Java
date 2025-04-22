package Practice;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num=sc.nextInt();
		System.out.print("Prime factors: ");
		findPrimeFactors(num);
		}
	static void findPrimeFactors(int n){
		for(int i=2;i<=n;i++){
			while(n%i==0){
				System.out.print(i+" ");
				n/=i;
				}
	    }
	}
}