package dataTypes;

public class ArrayTempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double celcius[]= {32.5,87.6,67.0};
        double fahren[] =new double[celcius.length];
        for(int i=0;i<celcius.length;i++)
		{
        	fahren[i]=(celcius[i]*9/5)+32;
		}
        for(int i=0;i<celcius.length;i++)
		{
        	System.out.println("Celsius: "+celcius[i]+" -> Fahrenheit: "+fahren[i]);
		}
	}
}