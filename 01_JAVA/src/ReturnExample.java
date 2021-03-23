public class ReturnExample {
    public static int example (int arg1, int arg2){
        return arg1 - arg2; //return przekazuje do przypisania dalej wynik
    }

    public static void main(String[] args) {
        int result = example(4, 2); //wyświetla wartość obliczoną w return, int result = arg1 - arg2
        System.out.println(result);

        int result2 = example(5,2);
        System.out.println(result2);

        int result3 = example(1532, 8652);
        System.out.println(result3);
    }
}
