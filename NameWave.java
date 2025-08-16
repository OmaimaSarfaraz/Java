package Practice;

public class NameWave {
    public static void main(String[] args) throws InterruptedException {
        String name = "JAVA";
        int offset = 0;
        while (true) {
            System.out.print("\r" + " ".repeat(Math.abs(offset)) + name);
            Thread.sleep(100);
            offset = (offset + 1) % 6 - 3;
        }
    }
}