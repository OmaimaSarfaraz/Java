package Practice;
import java.util.Random;

public class MazeGenerator {
    public static void main(String[] args) {
        int rows=10, cols=20;
        Random rand=new Random();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(rand.nextBoolean() ? " " : "#");
            }
            System.out.println();
        }
    }
}