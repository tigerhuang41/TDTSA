import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;


public class ZonedDateTimeExample {

    private static final String DATE_FORMAT = "MM/dd/yyyy hh:mm:ss a EEEE";

    public static void main(String[] args) {

        String dateInString = "03/02/2022 10:51:55 AM Wednesday"; //input sample date
        LocalDateTime ldt = LocalDateTime.parse(dateInString, DateTimeFormatter.ofPattern(DATE_FORMAT));

        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        System.out.println("TimeZone : " + singaporeZoneId);

        //LocalDateTime + ZoneId = ZonedDateTime
        ZonedDateTime asiaZonedDateTime = ldt.atZone(singaporeZoneId);
        System.out.println("Date (Singapore) : " + asiaZonedDateTime);

        ZoneId newYokZoneId = ZoneId.of("America/New_York");
        System.out.println("TimeZone : " + newYokZoneId);

        ZonedDateTime nyDateTime = asiaZonedDateTime.withZoneSameInstant(newYokZoneId);
        System.out.println("Date (New York) : " + nyDateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
        System.out.println("\n---DateTimeFormatter---");
        System.out.println("Date (Singapore) : " + format.format(asiaZonedDateTime));
        System.out.println("Date (New York) : " + format.format(nyDateTime));
        
        ZoneId zone = ZoneId.of("America/New_York");
        ZoneRules rules = zone.getRules();
        ZonedDateTime now = ZonedDateTime.now(zone);
        ZoneOffsetTransition transition = rules.nextTransition(now.toInstant());
        Instant max = now.plusYears(1).toInstant();
        while (transition != null && transition.getInstant().isBefore(max)) {
        System.out.println(transition);
        transition = rules.nextTransition(transition.getInstant());
    }

    }

}