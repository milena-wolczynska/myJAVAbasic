package RegexExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx03 {
    /*Prepare an application that downloads any string of characters from the user
    and checks it whether the entered value is a valid user login. For correct login
    we consider text containing upper and lower case letters and numbers. Min length
    is 8 and max 16 characters*/
    public static boolean userLoginChecker(String userLogin) {
        //Pattern userPattern = Pattern.compile("[[a-z][A-Z][0-9]]{8,16}$");
        Pattern userPattern = Pattern.compile("[a-zA-Z0-9]{8,16}");
        Matcher userMatcher = userPattern.matcher(userLogin);
        return userMatcher.matches();

    }

    public static void main(String[] args) {
        Scanner logScan = new Scanner(System.in);
        while (true){
            System.out.println("provide user login");
            String userInput = logScan.nextLine();
            if (userInput.equals("exit")) break;
            System.out.println(userLoginChecker(userInput));

        }

    }
}
