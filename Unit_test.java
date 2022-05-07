import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Calendar;  
import java.util.Locale;
import java.util.TimeZone;
import java.time.zone.ZoneRules;
import java.time.ZoneId;
import java.time.LocalDateTime;	
import java.time.ZonedDateTime;

public class Unit_test {

        /**
         * Utility function to convert java Date to TimeZone format
         * @param date
         * @param format
         * @param timeZone
         * @return
         */
        public static String formatDateToString(Date date, String format,
                        String timeZone) {
                // null check
                if (date == null) return null;
                // create SimpleDateFormat object with input format
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                // default system timezone if passed null or empty
                if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
                        timeZone = Calendar.getInstance().getTimeZone().getID();
                }
                // set timezone to SimpleDateFormat
                sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
                // return Date in required format with timezone as String
                return sdf.format(date);
        } 

public static void main(String[] args) {  
    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    String strDate = formatter.format(date);  
    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
  
    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
  
    formatter = new SimpleDateFormat("dd MMMM yyyy");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
  
    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
  
    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
    
    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss EEEE"); //adds the day to the date as per requirements mentioned
    strDate = formatter.format(date);  
    System.out.println("Date Format with Day, dd MMM yyyy HH:mm:ss z : "+strDate);  

    System.out.println("Default Date:"+date.toString());
    System.out.println("System Date: "+formatDateToString(date, "dd MMM yyyy hh:mm:ss a z", null));
    System.out.println("System Date in PST: "+formatDateToString(date, "dd MMM yyyy hh:mm:ss a z", "PST"));
    System.out.println("System Date in IST: "+formatDateToString(date, "dd MMM yyyy hh:mm:ss a z", "IST"));
    System.out.println("System Date in GMT: "+formatDateToString(date, "dd MMM yyyy hh:mm:ss a z", "GMT"));

// The following code is used to test whether it can accurately determine whether a given date is in daylight saving time to check whether the daylight saving time interval can be used normally.
    ZoneId zoneId = ZoneId.of("America/New_York");
    LocalDateTime localDateTime = LocalDateTime.now();
    ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
    ZoneRules rules = zoneId.getRules();
    boolean result = rules.isDaylightSavings(zonedDateTime.toInstant());
  
}
}


