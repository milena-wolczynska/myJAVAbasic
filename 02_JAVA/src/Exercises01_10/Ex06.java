package Exercises01_10;

public class Ex06 {
     /*For a given array of ints, count how many negative numbers are in it.
    If there are any, create a new array to which it will rewrite
    only these negative numbers*/

    public static int[] negCounter(int... negativeNum) {
        int counter06 = 0;
        for (int number06 : negativeNum) {
            if (number06 < 0) counter06++;
        }
        int[] array06 = new int[counter06];
        int index06 = 0;
        for (int number06 : negativeNum) {
            if (number06 < 0) {
                array06[index06] = number06;
                index06 ++;
            }
        }
        System.out.println("counted negative numbers: " + counter06);
        return array06;

    }

    public static void main(String[] args) {
        int[] table06 = negCounter(3, -11, 18, -2, -96);
        TablePrinter.printerT(table06);
    }
}
