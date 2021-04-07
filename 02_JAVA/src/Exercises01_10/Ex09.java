package Exercises01_10;

public class Ex09 {
    /*Calculate the rest of two numbers division. Write your own modulo version*/
    public static int myModVer (int num1, int mod1) {
        int division = num1 / mod1;
        int modValue = num1 - (mod1 * division);
        return modValue;

    }

    public static void main(String[] args) {
        System.out.println("your modulo is " + myModVer(523, 11));

    }
}
