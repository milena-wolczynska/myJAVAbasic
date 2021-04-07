package Exercises01_10;

public class Ex07_1 {

    public static int[] arithmeticSequence08 (int firstVal08, int gap08, int length08) {
        int[] array08 = new int[length08];
        array08[0] = firstVal08;
        for (int index08 = 1; index08 < length08; index08++) {
            array08[index08] = gap08 + array08[index08 - 1];

        }
        return array08;
    };

    public static void main(String[] args) {
        //arithmeticSequence(1, 3, 8);
        System.out.println("your sequence has " + arithmeticSequence08(1,3,8).length + " numbers");
        TablePrinter.printerT(arithmeticSequence08(1,3,8));
    }
}
