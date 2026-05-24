package Practice;

public class TypeEffect {
    public static void main(String[]args)throws InterruptedException {
        String text="Welcome to the Java World!";
        for(int i=0;i<text.length();i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(100); // type delay
        }
        System.out.println();
    }
}