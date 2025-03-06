package Encap;

public class TemperatureConverter {
	private double ctemp=0.0,ftemp=0.0;
    void setCelcius(double a) {
    	ctemp=a;
    	System.out.println("Temperature in Celcius: "+ctemp);
    }
    void setFahrenheit(double a) {
    	ftemp=a;
    	System.out.println("Temperature in Fahrenheit: "+ftemp);
    }
    void toFahrenheit() {
    	ftemp=(ctemp*9/5)+32;
    }
    void toCelcius() {
    	ctemp=(ftemp-32)*5/9;
    }
    void showTemp() {
    	System.out.println("Converted Temperature in Fahrenheit: "+ftemp);
    	System.out.println("Converted Temperature in Celcius: "+ctemp);
    }
}