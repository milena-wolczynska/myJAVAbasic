package DateTimeExercises09_15;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTimeEx11 {
    // Display current time & date by LocalDateTime using
    public static LocalDateTime actualDateTime (String myActualDT){
        ZoneId zoneId = ZoneId.of(myActualDT);
        /*LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        return localDateTime;*/
        return LocalDateTime.now(zoneId);
    }
    public static LocalDateTime localDateTimeNow (){
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        //System.out.println(actualDateTime("Europe/Berlin"));
        System.out.println("your actual date & time is: " + '\n');
        System.out.println(localDateTimeNow());

    }

}
