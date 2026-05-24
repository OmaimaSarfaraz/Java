package Lab04;

public class Employeee {
	public static double calculateBonus(int salary){
		return salary*0.05;
	}
	public static double calculateBonus(int salary, int ch){
		switch(ch)
		{
		case 1:
			return salary*0.0;
		case 2:
			return salary*0.05;
		case 3:
			return salary*0.10;
		case 4:
			return salary*0.15;
		case 5:
			return salary*0.20;
		default:
			return salary*0.0;
		}
	}
}