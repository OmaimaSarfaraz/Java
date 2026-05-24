package inherit;
import java.util.Scanner;

public class InteractiveGalaxyMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		InteractiveBattleShip ship=new InteractiveBattleShip();
        int choice;
        do {
            System.out.println("\n===== SpaceShip Command Center =====");
            System.out.println("1. Launch");
            System.out.println("2. Navigate");
            System.out.println("3. Activate Weapons");
            System.out.println("4. Attack");
            System.out.println("5. Exit");
            System.out.print("Choose an action (1-5): ");
            choice=sc.nextInt();
            switch(choice) {
                case 1:ship.launch();
                       break;
                case 2:ship.navigate();
                       break;
                case 3:ship.activateWeapons();
                       break;
                case 4:ship.attack();
                       break;
                case 5:System.out.println("🛑 Mission Ended.");
                       break;
                default:System.out.println("Invalid option! Try again.");
            }
        } while(choice!=5);
	}
}