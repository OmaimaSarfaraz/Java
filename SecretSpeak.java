package Practice;
import java.util.Scanner;

public class SecretSpeak {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter message: ");
        String msg=sc.nextLine();
        String out="";

        for(int i=msg.length()-1;i>=0;i--) {
            char c=msg.charAt(i);
            out+=c;
            if(Character.isLetter(c)) out+="🌀";
        }

        System.out.println("🔐 Secret Version: "+out);
        sc.close();
    }
}