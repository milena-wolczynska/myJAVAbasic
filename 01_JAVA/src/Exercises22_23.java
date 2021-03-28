public class Exercises22_23 {
    //ex22 write loop for counting from 1 to 10
    public static void main(String[] args) throws InterruptedException {

        int a = 1;
        System.out.println("zaczynam liczyć");
        while (a <= 10) {
            System.out.println(a);
            Thread.sleep(1000);
            a++;
        }
        System.out.println("szukam");

        //ex23 when loop will count to 5, break loop
        int a1 = 0;
        System.out.println("zaczynam liczyć");
        while (a1 <= 10) {
            System.out.println("przed if-em");
            a++;
            if (a1 == 5) {
                // break;
                continue;
            }
            Thread.sleep(1000);
            System.out.println(a);
        }
        System.out.println("szukam");
    }

}
