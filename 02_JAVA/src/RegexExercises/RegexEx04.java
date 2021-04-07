package RegexExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx04 {
    /* Prepare an application that downloads any string of characters
    from the user and checks it does the entered value contain the word "ala"*/
    public static void main(String[] args) {
        Scanner wordScan = new Scanner(System.in);
        while (true) {
            System.out.println("write the text");
            String textInput = wordScan.nextLine();
            if (textInput.equals("exit")) break;
            System.out.println(wordAlaChecker(textInput));
        }
    }

    public static boolean wordAlaChecker(String userText) {
        Pattern textPattern = Pattern.compile("[\\w ]*(ala)+[\\w ]*");
        Matcher textMatcher = textPattern.matcher(userText);
        return textMatcher.matches();
    }

}
