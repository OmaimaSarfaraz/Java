package operators;
import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks=sc.nextInt();
        if(marks>=90)
        	System.out.println("Grade: A");
        else if(marks>=75)
        	System.out.println("Grade: B");
        else if(marks>=60)
        	System.out.println("Grade: C");
        else if(marks>=40)
        	System.out.println("Grade: D");
        else 
        	System.out.println("Grade: F (Fail)");
	}
}