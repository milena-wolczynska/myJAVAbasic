package Exercises01_10;

public class Ex05 {
    /*
    * EX05 For the given int table, display
    the smallest and largest number from the table
    * */
    public static void findMinMax(int... table1) {
        if (table1.length < 1) {
            System.out.println("your table is too short");
            return;
        }
        int min = table1[0];
        int max = table1[0];
        for (int elementX: table1) {
            if (elementX > max) {
                max = elementX;
            }
            if (elementX < min) {
                min = elementX;
            }

        }

        System.out.println("your minimum table value is " + min);
        System.out.println("your maximum value is " + max);
    }


    public static void main(String[] args) {
        findMinMax(18, 2, 10, 3, 15);

    }

}
