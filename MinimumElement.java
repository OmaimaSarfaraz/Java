package Practice;
import java.util.Scanner;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.println("Enter Six Numbers: ");
		for(int i=0;i<6;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=1;i<6;i++)
		{
		if(arr[i]<min){
		    min=arr[i];
		}
		}
		System.out.println("Smallest number: "+min);
	}

}
