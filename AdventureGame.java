package loops;
import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("🏕️ Welcome to the Adventure Path!");
        System.out.println("You're standing at a fork in the road.");
        System.out.println("1. Go left into the forest");
        System.out.println("2. Go right toward the mountains");
        System.out.print("Choose a path (1 or 2): ");
        int choice=sc.nextInt();

        if(choice==1){
            System.out.println("🌲 You enter a dark forest.");
            System.out.println("You see something shiny. What do you do?");
            System.out.println("1. Pick it up");
            System.out.println("2. Walk away");
            int action=sc.nextInt();
            if(action==1){
                System.out.println("💎 It's a magical gem! You gain powers!");
            } else {
                System.out.println("😱 You walk away, but get chased by wolves!");
            }
        } else if(choice==2){
            System.out.println("⛰️ You climb the rocky mountains.");
            System.out.println("You find a cave. Enter?");
            String answer=sc.next();
            switch(answer.toLowerCase()){
                case "yes":
                    System.out.println("🐉 A dragon appears! You tame it. You're a hero!");
                    break;
                case "no":
                    System.out.println("🌧️ You camp outside and enjoy the view.");
                    break;
                default:
                    System.out.println("🤔 You stand confused and fall asleep.");
            }
        } else {
            System.out.println("🚫 Invalid path. You stay at the starting point.");
        }

        System.out.println("🏁 The End of Your Journey!");	
	}
}