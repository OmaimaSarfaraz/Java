package Practice;

import java.util.Scanner;

public class LofiName {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String[]vibes={"in the rain","with late-night coffee","under the stars","on repeat","from a quiet room"};

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        int pick=name.length()%vibes.length;
        System.out.println("🎵 Lofi mix: \""+name+"'s beat "+vibes[pick]+"\"");
        sc.close();
    }
}