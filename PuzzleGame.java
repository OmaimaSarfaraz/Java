package Practice;

public class PuzzleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=2, result;
        result=--a + ++b * a-- - b++;
        System.out.println("Puzzle: result = --a + ++b * a-- - b++");
        System.out.println("Initial values: a=5, b=2");
        System.out.println("What is the result? 🤔");
        try {
        	Thread.sleep(3000);
        	} 
        catch(Exception e) {
        }
        System.out.println("Answer: "+result);
	}
}