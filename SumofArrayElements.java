package Lab06;

public class SumofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {10,70,30,40,50},sum=0;
		for (int i =0;i<numbers.length;i++) {
            sum+=numbers[i];
        }
		System.out.println("Sum: "+sum);
	}
}