package Practice;

public class PotatoFarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=455,plantsPerRow=266,totalPlants=rows*plantsPerRow,hours=19;
		int plantsPerHour=totalPlants/hours;
		System.out.println("Total potato plants: "+totalPlants);
		System.out.println("Potato plants per hour: "+plantsPerHour);
	}
}