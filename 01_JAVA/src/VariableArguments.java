public class VariableArguments {
    public static void printNumbersVarArgs(int... numbers) {
        System.out.println("printNumbersVarArgs");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers [" + i + "]==" + numbers[i]);
        }
        System.out.println("\n");
    }
    // printNumbersVarArgs praktycznie to samo co printNumbersTable
    public static void printNumbersTable(int[] numbers) {
        System.out.println("printNumbersTable");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers [" + i + "]==" + numbers[i]);
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        printNumbersVarArgs(1, 2, 3, 4);
        printNumbersTable(new int[]{1, 2, 3, 4});
    }
}
