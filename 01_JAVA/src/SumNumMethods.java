public class SumNumMethods {
    // sumNumbers(int[] numbers)
    public static int sumNumbers(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum =+ numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Main method here ! \n");
//        sumNumbers(new int[]{1,2,3});
        int result = sumNumbers(1,2,3); // int result = sum;
        System.out.println("End main method");
    }
    // sumNumbers(String info, int[] numbers)
    public static int sumNumbers(String info, int... numbers) {
        int sum = 0;
        System.out.println("moje info: " + info);
        for (int i = 0; i < numbers.length; i++){
            sum =+ numbers[i];
        }
        return sum;
    }
    public static void main2(String[] args) {
        System.out.println("Main method here ! \n");
//        sumNumbers("Dodaj nie gadaj", new int[]{1,2,3});
        int result = sumNumbers("Dodaj nie gadaj", 1,2,3); // int result = sum;
        System.out.println("End main method");
    }

}
