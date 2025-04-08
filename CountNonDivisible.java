package Practice;

public class CountNonDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=100;i++){
			if(i%2!=0 && i%3!=0 && i%5!=0){
				count++;
				System.out.println(i);
				}
			}
		System.out.println("Count: "+count);
	}
}