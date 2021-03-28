import java.util.Scanner;

public class Exercises24_27 {
    public static void main(String[] args) {

        //ex25 use table from 24ex, then by using for loop, print names based table.length
        String[] names = new String[] {"Milena", "Katarzyna", "Tomek", "Jola"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("table cell no " + i + " is: " + names[i]);
        }

        //ex24 write the String table with names. Print hello for all names from list
        // by using for each loop
        System.out.println("EX24");
        for (String name: names){ //String name = "Milena"; "K...
            System.out.println("hello " + name);
            //for each loop
        }

        //ex26 write program reading input stream (by Scanner class)
        // and printing this input String. Run program and write the name in console
        Scanner lineReader = new Scanner(System.in);
        System.out.println("write name: ");
        String line1 = lineReader.nextLine();
        System.out.println("your name is: " + line1);


        //ex27write program taking int input number
        // then create conditional statement checking whether
        // this number is less than 100, 100 between 200 or more than 200
        Scanner lineReader2 = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = lineReader2.nextInt();
        System.out.println("your number is: ");
        if (number > 200) {
            System.out.println("more than 200");
        } else if (number > 100){
            System.out.println("more than 100 and less than 200");
        } else {
            System.out.println("less than 100");
        }

    }
}
