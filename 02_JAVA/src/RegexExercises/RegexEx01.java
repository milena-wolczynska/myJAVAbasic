package RegexExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx01 {
    /* Prepare an application that will download any string from the user and check it
    whether the entered value is a numerical value. If the user entered
    number, check if it is even or odd*/

    public static boolean digitalChecker(String inputNum) {
        Pattern myPattern1 = Pattern.compile("[0-9]+");
        //Pattern myPattern2 = Pattern.compile("\\d+");
        Matcher myChecker = myPattern1.matcher(inputNum);
        return myChecker.matches();

    }


    public static void main(String[] args) {
        System.out.println("give the number");
        Scanner myScan = new Scanner(System.in);
        String inputNum = myScan.nextLine();
        boolean result = digitalChecker(inputNum);
        System.out.println(result);

    }
}
