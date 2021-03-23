public class MethodsInJava {
    public static void printName(String myName) { //String myName = Milena
        System.out.println("run printName method");
        System.out.println("hello " + myName + "!");
        System.out.println('\n');

    }

    int number1 = 4; int number2 = 2;
    public static int addTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;
        return sum; // zwrócenie wartości do miejsca wywołania
    }

    public static void main(String[] args) {
        System.out.println("main method here \n");
        printName("Milena");
        printName("Kate");
        printName("Michael");
        printName("Tom");

        System.out.println("end of main method "); //line 3

        // return sum => int result = sum; int result = 6;
        int result = /*sum*/ addTwoNumbers(4,2);
        System.out.println(result);
        System.out.println("End main method");
    }
}
