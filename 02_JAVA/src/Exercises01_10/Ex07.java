package Exercises01_10;

public class Ex07 {
    /*Write a method that creates an arithmetic sequence with the following: length, first element,
    thrust difference*/


    public static int[] arithmeticSequence (int firstValue, int gap, int length){
        int[] array07 = new int[length];
        array07 [0] = firstValue;
        for (int indexAr07 = 1; indexAr07 < length; indexAr07++) {
            array07[indexAr07] = gap + array07[indexAr07 -1];

        }
        return array07;

    }
    public static void main(String[] args) {
        TablePrinter.printerT(arithmeticSequence(4, 7, 56));


    }
}
