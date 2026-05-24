package Practice;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=1;i<=7;i++){
			int fact=1;
			for(int j=1;j<=i;j++){
				fact*=j;
				}
			sum+=((double)i/fact);
			}
		System.out.println("Sum of the series: "+sum);
	}
}