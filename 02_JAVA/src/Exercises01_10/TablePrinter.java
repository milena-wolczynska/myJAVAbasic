package Exercises01_10;

public class TablePrinter {
    public static void printerT(int... myTab) {
        for (int someElement: myTab) {
            System.out.println("["+ someElement +"]");
        }
        System.out.println();

    }
}
