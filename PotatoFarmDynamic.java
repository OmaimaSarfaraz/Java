package Practice;
import java.util.Scanner;

public class PotatoFarmDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows=sc.nextInt();
		System.out.print("Enter number of plants per row: ");
		int plantsPerRow=sc.nextInt();
		System.out.print("Enter total hours for planting: ");
		int hours=sc.nextInt();
		int totalPlants=rows*plantsPerRow;
		int plantsPerHour=totalPlants/hours;
		System.out.println("Total potato plants: "+totalPlants);
		System.out.println("Potato plants per hour: "+plantsPerHour);
	}
}