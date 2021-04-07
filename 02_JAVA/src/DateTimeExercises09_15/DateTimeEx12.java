package DateTimeExercises09_15;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeEx12 {
    /*Create an object of type LocalDate that stores the date 01/01/2017 and an object
    of type LocalDate which stores the date 05/05/2017. Using an object of the
    Period type. Display how much time has passed between dates*/
    public static LocalDate locDateCreator (int year, int mth, int day){
        return LocalDate.of(year, mth, day);
    }

    public static Period diffDateChecker (LocalDate date1, LocalDate date2){
        Period diffD = Period.between(date1, date2);
        return diffD;
    }

    public static void main(String[] args) {
        LocalDate date1 = locDateCreator(2017,1,1);
        LocalDate date2 = locDateCreator(2017,5, 5);
        Period diffValue = diffDateChecker(date1, date2);
        System.out.println("the difference between your dates is: " + diffValue.getMonths() + "months & " + diffValue.getDays() + "days");
        System.out.println("The difference between the dates equals: " + diffValue.toString());

    }

}
