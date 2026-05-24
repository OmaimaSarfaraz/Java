package Practice;

public class ASCIIValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<=255)
		{
			System.out.println("ASCII "+i+" = "+(i<32 || i==127 ? "Control Character" : (char)i));
			i++;
		}
	}
}