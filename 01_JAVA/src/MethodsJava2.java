public class MethodsJava2 {
    public static void printName(String name){ // String name = "Milena";
        System.out.println("Run printName method");
        System.out.println("Hello " + name + "!");
        System.out.println();
    }
    // int number1 = 4; int number2 = 2;
    public static int addTwoNumbers(int number1, int number2) {
        return number1 + number2; // zwrócenie wartości do miejsca wywołania
    }
    public static void main(String[] args) {
        System.out.println("Main method here ! \n");
        // return sum => int result = sum; int result = 6;
        // int result = number1 + number2;
        int result = addTwoNumbers(4,2);
        System.out.println("result=" + result);
        System.out.println("End main method");
    }
}
