package Practice;
import java.util.Scanner;

public class StatsCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nums[]=new int[5];
		System.out.println("Enter 5 integers:");
		for(int i=0;i<5;i++){
			nums[i]=sc.nextInt();
			}
		calculateStats(nums);
		}
	static void calculateStats(int arr[]){
		int sum=0;
		for(int i=0;i<5;i++){
			sum+=arr[i];
			}
		double average=sum/5.0;
		double sd=0;
		for(int i=0;i<5;i++){
			sd+=Math.pow(arr[i]-average,2);
			}
		sd=Math.sqrt(sd/5);
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);
		System.out.println("Standard Deviation: "+sd);
	}
}