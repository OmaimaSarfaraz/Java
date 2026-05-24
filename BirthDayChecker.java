package Practice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class BirthDayChecker {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String dateInput=sc.nextLine();
        LocalDate date=LocalDate.parse(dateInput,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek day=date.getDayOfWeek();
        System.out.println("You were born on a "+day+"!");
        sc.close();
    }
}