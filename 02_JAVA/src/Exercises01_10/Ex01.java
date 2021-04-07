package Exercises01_10;

public class Ex01 {
    /*Write a piece of the multiplication table * 5
    Modify below to display this piece of this table
    for the number given in the parameter*/

    public static void multiplyBy5 (int number) {
        System.out.println("multiply method is running");
        for (int i = 0; i <= number ; i++) {
            int result = i * 5;
            System.out.println("5 * " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        System.out.println("exercise 1 start");
        multiplyBy5(8);
    }
}
