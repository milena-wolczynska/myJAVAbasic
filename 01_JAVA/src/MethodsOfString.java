import java.util.Scanner;

public class MethodsOfString {
    public static void main(String[] args) {

        //String pool
        //int a;
        //float b; primitive type, only data
        //String c; complex type/ class/ data/ methods
        String name = "Milena";
        String name1 = "Milenka";
        String name2 = "Milka";
        String name3 = new String("Milena");
        String name4 = "Milena";

        System.out.println("score of equals: " + name.equals(name1));
        System.out.println("score of equals: " + name.equals(name3));
        System.out.println("score of equals: " + name.equals(name4));

        System.out.println("score: " + (name == name3));
        System.out.println("score: " + (name == name4));
        //== compares Strings references/ RAM memory address

        System.out.println("name address: " + System.identityHashCode(name));
        System.out.println("name3 address: " + System.identityHashCode(name3));
        System.out.println("name4 address: " + System.identityHashCode(name4));

        //concat of Strings/ length/ lower/ upper/ index of/ replace
        String names1 = "Mi";
        String names2 = "lena";
        System.out.println(names1.concat(names2));

        System.out.println(name1.length());
        System.out.println('\n');
        System.out.println(names1.toLowerCase().concat(names2.toUpperCase()));
        String text = "I'm just study of java programming";
        System.out.println(text.indexOf("just"));
        System.out.println(text.lastIndexOf("just"));
        System.out.println(text.replaceAll("u", "Ó"));
        System.out.println(text.replaceAll("programming", "basic").concat(names1).concat(names2));

        Scanner addressForm = new Scanner(System.in);
        String addressLine = "";
        while (true) {
            System.out.println("enter your address");
            addressLine = addressForm.nextLine(); //czytanie do znaku \n
            if (addressLine.length() > 0) break;
        }
        System.out.println("enter your first name");
        String firstNameLine = addressForm.nextLine();
        System.out.println("enter your last name");
        String lastNameLine = addressForm.nextLine();

        System.out.println("your address is: " + addressLine);
        System.out.println("your name is: " + firstNameLine + lastNameLine);

        System.out.printf("100 / 3 = %4d", 100 / 3);


    }
}
