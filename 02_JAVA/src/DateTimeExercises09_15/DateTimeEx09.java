package DateTimeExercises09_15;

import java.time.LocalTime;

public class DateTimeEx09 {
    // Display current time by LocalTime using
    public static LocalTime actualTime() {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        return nowTime;
    }

    public static void main(String[] args) {
        LocalTime myTime = actualTime();
        System.out.println("now is " + myTime);
    }

}
