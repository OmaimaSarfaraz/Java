package Lab06;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.println("Enter Six Numbers: ");
		for(int i=0;i<6;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<6;i++)
		{
		if(arr[i]>max){
		    max=arr[i];
		}
		}
		System.out.println("Largest number: "+max);
	}
}