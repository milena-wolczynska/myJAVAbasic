package DateTimeExercises09_15;

import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeEx09_1 {
    //String ZoneId using
    public static LocalTime showTimeNow() {
        LocalTime nowTime= LocalTime.now();
        System.out.println(nowTime);
        return nowTime;
    }
    public static LocalTime showTimeNowByZoneId(String strZoneId) {
        ZoneId zone= ZoneId.of(strZoneId);
        LocalTime nowTime= LocalTime.now(zone);
        System.out.println(nowTime);
        return nowTime;
    }
    public static void main(String[] args) {
        LocalTime time = showTimeNow();
        System.out.println("returned in main time " + time);
        LocalTime zoneTime =  showTimeNowByZoneId("Asia/Tokyo");
        System.out.println(zoneTime);
    }
}
