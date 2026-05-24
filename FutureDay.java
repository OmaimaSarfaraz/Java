package Practice;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FutureDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days into future: ");
        int days = sc.nextInt();
        LocalDate future = LocalDate.now().plusDays(days);
        String day = future.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("It will be a " + day);
        sc.close();
    }
}