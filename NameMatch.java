package Practice;
import java.util.Scanner;

public class NameMatch {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name 1: ");
        String a=sc.nextLine().toLowerCase();
        System.out.print("Enter name 2: ");
        String b=sc.nextLine().toLowerCase();

        int match=0;
        for(int i=0;i<a.length();i++) {
            char c=a.charAt(i);
            if(b.indexOf(c)!=-1) match++;
        }

        double percent=(double)match/Math.max(a.length(),b.length())*100;
        System.out.printf("🔍 Similarity: %.2f%%\n",percent);
        if(percent>70) System.out.println("👯 You might be siblings!");
        else System.out.println("👫 Just friends maybe.");
    }
}