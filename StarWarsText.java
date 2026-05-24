package Practice;

public class StarWarsText {
    public static void main(String[] args) throws InterruptedException {
        String text = "A long time ago in a galaxy far, far away...";
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(150);
        }
        System.out.println();
    }
}