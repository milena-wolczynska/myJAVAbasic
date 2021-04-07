package Exercises01_10;

public class Ex04 {
    //For the given array of some int-s, swap the first and last elements

    public static void main(String[] args) {
        int [] array1 = swapTable(1, 5, 63, 18);
        String tableName = "your table is: ";
        System.out.println(tableName);
        TablePrinter.printerT(array1);

    }

    public static int[] swapTable(int... array) {
        if (array.length <= 2) {
            System.out.println("Your array is too short");
            return array;
        }
        int tmp = array[0]; //tmp przechowuje element tab z indeksem 0
        array[0] = array[array.length - 1];
        array[array.length - 1] = tmp;
        return array;

    }
}
