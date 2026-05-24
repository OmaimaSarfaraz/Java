package Practice;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneClock {
    public static void main(String[] args) {
        String[] zones = {"Asia/Tokyo", "Europe/London", "America/New_York"};
        for(String zone : zones) {
            ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
            System.out.println(zone + ": " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        }
    }
}