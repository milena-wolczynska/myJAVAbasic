package Exercises01_10;

    public class Ex10 {
        /*Write a method that will check, the method written in the previous
        task returns exactly the same results as modulo operator*/
        public static boolean moduloChecker (int modVal, int... sequenceNumbers ){
            for (int num10: sequenceNumbers) {
                int modResult = num10 % modVal;
                int myModResult = Ex09.myModVer(num10, modVal);
                if (myModResult != modResult)
                    return false;
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(moduloChecker(2,1,8,19,121));
        }



}
