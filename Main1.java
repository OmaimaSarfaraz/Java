package Encap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  library a=new library();
	      a.showStatus();
	      
	      passwordmanager b=new passwordmanager();
	      b.changePass("abc123", "pass12");
	      b.validatePass("pass12");
	      
	      lightBulb c=new lightBulb();
	      c.showStatus();
	      
	      TemperatureConverter d=new TemperatureConverter();
	      d.setCelcius(151.9);
	      d.toFahrenheit();
	      d.setFahrenheit(123.6);
	      d.toCelcius();
	      d.showTemp();
		}
	}