package Exercises01_10;

public class Ex03 {
    //Write a method which for given two parameters X and Y
    // will calculate the sum of the numbers from X to Y
    public static int countSum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
             sum = sum + i;
            // sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = countSum(18, 1);
        int result2 = countSum(8, 82);
        System.out.println("Result =" + result);
        System.out.println("Result2 =" + result2);
    }
}

