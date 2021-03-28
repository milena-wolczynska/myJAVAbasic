public class Exercises11_21 {
    public static void main(String[] args) {
        //ex11 cast int type variable into float type variable
        int a = 12;
        //implicit casting/rzutowanie niejawne
        float b = a;
        //explicit casting
        float c = (float) a;
        System.out.println(b);
        System.out.println(c);

        //ex12 cast float type variable into int type variable
        float a12 = (float) 523.23698;
        int b12 = 600;
        System.out.println(b12);

        //ex13 write float variable to store the temperature of the person and then
        //check in the conditional statement if the person has a fever tip: if (temp> 37.5).
        float a13 = 35.0F;
        if (a13 > 37.5) {
            System.out.println("you have a high temperature!");
        }

        //ex14 expand task13 and add the opposite situation (else), print the information that the man is healthy
        if (a13 < 37.5) {
            System.out.println("you are healthy");
            System.out.println("you can do covid test!");
        }

        //ex15 expand task 13 and 14 and add another condition to the conditional function (else if).
        //If the temperature is higher than 37.5 write that he has a fever, if it is between 37.5 and 36.0 it is normal,
        //and if it is lower than 36, print the information that it is too low
        if (a13 > 37.5) {
            System.out.println("you have a fever!");
        } else if (a13 <= 37.5 && a13 >= 36.0) {
            System.out.println("U have still normal temperature");
        } else System.out.println("your temperature is to low");

        //ex17 similarly to tasks 13, 14, 15, prepare a scenario for any case,
        //e.g. housing prices per meter on the real estate market
        float priceOfMeter = 9999.99f;
        String valueOfPrice = "PLN";
        if (priceOfMeter > 12000.00) {
            System.out.print("price is too high!");
        } else if (priceOfMeter >= 12000 && priceOfMeter < 10000) {
            System.out.print("price is relative ok");
        } else {
            System.out.print("your price is: " + priceOfMeter + valueOfPrice + " is a very big promotion");
            System.out.println('\n');


            //ex17
            float BMI = 10.5f;
            if (BMI > 29.99)
                System.out.println("OBESITY!");
            else if (BMI >= 24.99)
                System.out.println("OVERWEIGHT!");
            else if (BMI >= 18.5)
                System.out.println("normal");
            else if (BMI < 18.5 && BMI >= 16.0)
                System.out.println("underweight!");
            else
                System.out.println("go to the doctor!");

            //ex18 Write the 'name' variable, prepare a switch-case conditional function.
            //Say hello to the names Mike, John, Kate in the way Hello <name>. Default print "Hello someone"
            String name = "Mike";
            String a1 = "Hello";
            switch (name) {
                case "Mike":
                    System.out.println(a1 + " Mike");
                    break;
                case "John":
                    System.out.println(a1 + " John");
                    break;
                case "Kate":
                    System.out.println(a1 + " Kate");
                    break;
                default:
                    System.out.println(a1 + " someone");
            }

            //ex19 write a loop for printing the counting from 1 to 10
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            //count to ten
            System.out.println("I'm starting count");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("I'm looking for you");

            //ex20 write a loop for printing the counting from 0 to 20
            for (int i1 = 0; i1 <= 20; i1++) {
                System.out.println(i1);
            }
            System.out.println('\n');

            //ex21 write a loop for printing the counting from 10 to 1
            for (int i2 = 10; i2 >= 0; i2--) {
                System.out.println(i2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("I'm finished count");


        }

    }
}
