package Exercises01_10;

public class Ex02 {
    //ex2  dla danej liczby sprawdź, czy jest ona liczbą pierwszą
    public static boolean checkingPrimeNumbers(int number) {
        if (number < 2) return false;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        boolean isPrimeAgain = checkingPrimeNumbers(98);
        if (isPrimeAgain) {
            System.out.println("The number IS prime");
        } else {
            System.out.println("The number is NOT prime");
        }
    }
}
