package Exercises01_10;

public class Ex08 {
    //Verify whether the string of numbers provided is an arithmetic sequence
    public static boolean isArithmetic08(int... table08) {
        if (table08.length < 2) {
            return false;

        }

        boolean isArithm08 = true;
        int diff08 = table08[1] - table08[0];
        for (int index08 = 2; index08 < table08.length; index08++) {
            int diff1 = table08[index08] - table08[index08 - 1];
            if (diff1 != diff08) {
                isArithm08 = false;
                break;
            }
        }
        return isArithm08;

    }

    public static void main(String[] args) {
        System.out.println("is arithmetic? " + isArithmetic08(1,2,3,4));
    }
}
