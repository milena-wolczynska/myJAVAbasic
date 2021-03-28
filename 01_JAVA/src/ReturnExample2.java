public class ReturnExample2 {
    public static boolean checkIfArithmetic(int[] sequence) {
        if (sequence.length < 2) {
            //System.out.println("This sequence is NOT Arithmetic");
            return false;
        }
        boolean isArithmetic = true;
        int gap = sequence[1] - sequence[0];
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] - sequence[i - 1] != gap) {
                isArithmetic = false;
                //System.out.println("This sequence is NOT Arithmetic");
                break;
            }
        }
        return isArithmetic;
    }
    public static void main(String[] args) {
        boolean result = checkIfArithmetic(new int[]{1, 2, 3, 4, 4, 6});
        if (result) {
            System.out.println("This sequence IS Arithmetic");
        } else {
            System.out.println("This sequence is NOT Arithmetic");
        }
    }
}
