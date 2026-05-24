package dataTypes;
import java.util.Scanner;

public class DataTypePuzzle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("🔍 GUESS THE OUTPUT");
        System.out.println("byte b = 50;");
        System.out.println("b = b * 2;");
        System.out.println("What will happen?");
        System.out.println("1. It will compile and give 100");
        System.out.println("2. Compilation error");
        System.out.println("3. Runtime error");
        System.out.print("Enter your answer (1-3): ");
        int answer=sc.nextInt();

        System.out.println("\nChecking...");
        try {Thread.sleep(2000);} catch(Exception e){}

        if(answer==2){
            System.out.println("✅ Correct! Compilation Error.");
        } else {
            System.out.println("❌ Wrong! The correct answer is 2. Compilation Error.");
        }

        System.out.println("\n🧠 Why?");
        System.out.println("Because in 'b = b * 2', b * 2 is implicitly promoted to int.");
        System.out.println("You must cast it like: b = (byte)(b * 2);");
    }
}