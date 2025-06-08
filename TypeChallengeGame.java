package dataTypes;
import java.util.Scanner;

public class TypeChallengeGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=0;
        System.out.println("🎯 Data Type Conversion Challenge");

        System.out.println("\nQ1: What is (int)65.99 ?");
        System.out.print("Your Answer: ");
        int ans1=sc.nextInt();
        if(ans1==65){
        	System.out.println("✅ Correct!"); score++;}
        else 
        	System.out.println("❌ Wrong. Answer is 65.");

        System.out.println("\nQ2: What is (char)66 ?");
        System.out.print("Your Answer: ");
        char ans2=sc.next().charAt(0);
        if(ans2=='B'){
        	System.out.println("✅ Correct!"); score++;}
        else 
        	System.out.println("❌ Wrong. Answer is B.");

        System.out.println("\nQ3: What is (byte)130 ?");
        System.out.print("Your Answer: ");
        byte ans3=sc.nextByte();
        if(ans3==-126){
        	System.out.println("✅ Correct!"); score++;}
        else 
        	System.out.println("❌ Wrong. Answer is -126 (overflow).");

        System.out.println("\n🎉 Your Score: "+score+"/3");
    }
}