package Practice;

public class StarWarsCrawl {
    public static void main(String[] args) throws InterruptedException {
        String[] lines = {
            "A long time ago in a galaxy far,",
            "far away....",
            "",
            "EPISODE IV",
            "A NEW HOPE",
            "",
            "It is a period of civil war.",
            "Rebel spaceships, striking",
            "from a hidden base..."
        };
        for(String line : lines){
            System.out.println(line);
            Thread.sleep(800);
        }
    }
}