package OOP_Exercises.ClassesLearning.StaticNonstatic;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeLearning {
    public void dateNow() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("your local date & time is: " + ldt);
        Instant now = Instant.now();
        System.out.println("your instant " + now );
    }
    public static void tokyoDateTime() {
        Clock myClock = Clock.system(ZoneId.of("Asia Tokyo"));
        LocalDateTime ldt = LocalDateTime.now(myClock);
        System.out.println("Japan time is: " + ldt);
    }
    public static void myDateFormat() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
        System.out.println("your format date yyyy/mm/dd: " + myFormatter.format(ldt));
    }

    public static void main(String[] args) {
        DateTimeLearning dateTimeLearning = new DateTimeLearning();
        //nonstatic method at the Object is a must
        dateTimeLearning.dateNow();
        //Object is not necessarily in static method, this can be in Class call
        //ex--> dateNow(); == DateTimeTraining.dateNow()
        tokyoDateTime();
        myDateFormat();
    }
    private String color = "Red";
    // metoda wykorzystujaca niestatyczne atrybuty klasy musi byc nie statyczna
    // czyli na obiekcie zawołana
    public void dateNowTwo(){
        String hereColor = this.color;
    }
}
