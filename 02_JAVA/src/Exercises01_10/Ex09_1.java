package Exercises01_10;

public class Ex09_1 {
    public static void myModVer02(int num2, int mod02) {
        int num09_1 = 0;
        int remainder;
        while (num09_1 <= num2) {
            num09_1 = num09_1 + mod02;
        }
        remainder = num2 - (num09_1 - mod02);
        System.out.println(remainder);
        int javaRemainder = num2 % mod02;
        System.out.println(javaRemainder);
    }
    public static void main(String[] args) {
        myModVer02(12973, 9);
    }
}

