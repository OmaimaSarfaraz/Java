package Lab06;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,12,7,8,20,3,6,15,18,10};
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]%2==0){
		    System.out.print(arr[i]+" ");
		    }
		}
	}
}