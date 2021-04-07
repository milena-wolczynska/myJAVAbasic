package RegexExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
    /*Prepare an application that downloads a string from the user and checks if
    the given text is a valid Polish postal code (e.g. 85-155, 00-122)*/
    public static boolean postCodeChecker(String inputPostCode){
        Pattern myPostCodePattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
        Matcher myPostCodeMatcher = myPostCodePattern.matcher(inputPostCode);
        return myPostCodeMatcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("give postal code");
        Scanner myPostCodeScanner = new Scanner(System.in);
        String inputPostCode = myPostCodeScanner.nextLine();
        boolean result = postCodeChecker(inputPostCode);
        System.out.println("your postal code is " + result);

    }
}
