package StringExample;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocaldateTimeToUTC {
    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        ZonedDateTime ldtZoned = dateTime.atZone(ZoneId.systemDefault());
        ZonedDateTime utcZoned = ldtZoned.withZoneSameInstant(ZoneId.of("UTC"));
        String formateed=utcZoned.format(DateTimeFormatter.ofPattern("yyyy-MM-dd:HH:mm:ss"));
        System.out.println(formateed);
    }
}
