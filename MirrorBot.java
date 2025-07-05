package Practice;
import java.util.Scanner;

public class MirrorBot {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Look into the mirror... Say something: ");
        String msg=sc.nextLine();

        String mirror="";
        for(int i=msg.length()-1;i>=0;i--) {
            mirror+=msg.charAt(i);
        }

        System.out.println("👁 Mirror says: "+mirror);
        sc.close();
    }
}