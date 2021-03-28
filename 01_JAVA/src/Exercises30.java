public class Exercises30 {
    //ex30 Zwróć wartość z metody zamiast ją drukować. Zwróć wartość typu String.
    // W metodzie main przejmij zwracaną wartość i ją wydrukuj

    public static String sayHello (String name) {
        String helloYou = "Hello " + name + "!";
        return helloYou;
    }

    public static void main(String[] args) {
        System.out.println("main method run");
        //zmienna String result przechowuje wyniki poza ciałem metody
        String result = sayHello("Milenko");
        System.out.println(result);
        System.out.println("main method end");
    }

}
