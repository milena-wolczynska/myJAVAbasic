public class Exercises28_29 {
    //ex28 Nazwij i napisz ciało swojej metody drukującej hello
    // (uruchom tą metodę w metodzie main)

    //ex29 Rozwiń zadanie nr 28. Przyjmij do metody argument z imieniem
    // i wydrukuj w swojej metodzie 'hello <imie>'


    public static void sayHello(String name) {
        System.out.println("Hello!" + name + " Is it me you're looking for!");
    }

    public static void main(String[] args) {
        System.out.println("main method run");
        sayHello("Milenka");
        System.out.println("main method end");
    }
}
