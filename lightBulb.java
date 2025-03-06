package Encap;

public class lightBulb {
	private boolean isOn;
    void turnOn()
    {
    	isOn=true;
    }
    void turnOff()
    {
    	isOn=false;
    }
    void showStatus()
	{
		if(isOn)
			System.out.println("Bulb is On");
		else
			System.out.println("Bulb is Off");
	}
}
