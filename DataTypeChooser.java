package dataTypes;
import java.util.Scanner;

public class DataTypeChooser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose a data type:");
        System.out.println("1. Integer");
        System.out.println("2. Double");
        System.out.println("3. Character");
        System.out.println("4. Boolean");
        System.out.print("Enter your choice (1-4): ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter an integer: ");
                int i=sc.nextInt();
                System.out.println("You entered integer: "+i);
                break;
            case 2:
                System.out.print("Enter a double: ");
                double d=sc.nextDouble();
                System.out.println("You entered double: "+d);
                break;
            case 3:
                System.out.print("Enter a character: ");
                char c=sc.next().charAt(0);
                System.out.println("You entered character: "+c);
                break;
            case 4:
                System.out.print("Enter true or false: ");
                boolean b=sc.nextBoolean();
                System.out.println("You entered boolean: "+b);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}