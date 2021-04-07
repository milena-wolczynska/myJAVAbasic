package RegexExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPassword {
    public static void main(String[] args) {
        Scanner signScan = new Scanner(System.in);
        while (true) {
            System.out.println("write password");
            String passwordInput = signScan.nextLine();
            if (passwordInput.equals("exit")) break;
            System.out.println((passwordInput));
        }
    }
    public static boolean passwordChecker(String myPassword){
        Pattern passwordPattern = Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%!]).{8,20})");
        //look ahead ((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})
        Matcher passwordMatcher = passwordPattern.matcher(myPassword);
        return passwordMatcher.matches();
    }
}
