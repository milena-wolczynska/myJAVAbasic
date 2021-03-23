public class Exercises01_10 {
    public static void main(String[] args) {
        // ex 1-2
        String name1 = "Mila";
        String name2 = "Timi";
        String space = " ";
        System.out.println(name1 + space + "&" + space + name2);
        System.out.println( "is a big love");

        //ex 3
        int a = 123;
        int b = 321;
        System.out.println(a+b);

        //write the result to c variable
        int c = a + b;
        System.out.println("score: " + c);

        //ex4 write in main function sum of two variables float type & print score
        float a1 = 4.321_456F;
        float b1 = (float) 2.398523;
        float c1 = a1 + a1;
        System.out.println(new StringBuilder().append("score: ").append(c1).toString());

        //ex5
        double a2 = 5.266897455363225;
        double b2 = 7.265363225;
        double c2 = a2 + b2;
        System.out.println("score: " + c2);

        //ex6 add the multiplication operator
        double resultOfMulti = a2 * c2;
        System.out.println("score: " + resultOfMulti);

        //ex7 write in the main function dividing two variables of int type and print the result
        //version a, without modulo
        int d = 10;
        int e = 5;
        //variable conversion
        float de = d + e;
        System.out.println("conversion score: " + de);

        //version b, with modulo
        int d2 = 11;
        int e2 = 5;
        float f = (float) d2 / e2;
        System.out.println(d / e);
        //System.out.println((float)d2 / e2);
        System.out.println(f);

        //ex8 write in main function modulo operation and score print (modulo score)
        int i1 = 10;
        int i2 = 3;
        System.out.println( i1 % i2);

        //ex9 compare any two numbers == !=
        System.out.println("ex9 == :" + (i1 == i2));
        System.out.println("ex9 != :" + (i1 != i2));

        //ex10 write in main function comparing of two boolean variables false/ true
        boolean valueTrue = true;
        boolean valueFalse = false;
        System.out.println("ex10 == :" + (valueTrue == valueFalse));
        System.out.println("ex10 != :" + (valueTrue != valueFalse));
        System.out.println("ex10 && :" + (valueTrue && valueFalse));
        System.out.println("ex10 && :" + (valueTrue && valueTrue));
        System.out.println("ex10 || :" + (valueTrue || valueFalse));
        System.out.println("ex10 || :" + (valueFalse || valueFalse));
        System.out.println("ex10 || :" + (valueTrue == valueTrue));

    }
}
