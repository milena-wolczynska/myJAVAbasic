package Exercises01_10;

public class Ex01 {
    //Wypisz kawałek tabliczki mnożenia *5
    //Zmodyfikuj powyższe żeby wyświetlało ten kawałek tabliczki
    // dla liczby zadanej w parametrze.
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
