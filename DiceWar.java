package Practice;

public class DiceWar {
    public static void main(String[] args) {
        int player = (int)(Math.random()*6 + 1);
        int computer = (int)(Math.random()*6 + 1);

        System.out.println("🎲 You rolled: " + player);
        System.out.println("🤖 Computer rolled: " + computer);

        if(player > computer) 
        	System.out.println("🎉 You win!");
        else if(player < computer) 
        	System.out.println("😢 You lose!");
        else 
        	System.out.println("🤝 It's a draw!");
    }
}