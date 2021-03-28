public class MyTables {
    public static void main(String[] args) {
        // int tableLength = 4;
        String[] products = new String[5];
        products[0] = "apple";
        products[1] = "banana";
        products[2] = "grape";
        products[3] = "pineapple";
        products[4] = "strawberry";
        String product0 = products[0]; //odczytywanie z komórki tablicy
        System.out.println(products[0] + " and " + products[4] + " is healthy");
        System.out.println(products[1] + " is very sweet");


        for (int i = 0; i < 5; i++) {
            System.out.println(products[i]);
            System.out.println("fruit number [" + i + "] " + products[i]);
            System.out.println("fruit number " + i + 1 + " is " + products[i]);
        }
        System.out.println("there are " + products.length + " fruits");

        String[][] fruits = new String[5][];
        fruits[0] = new String[]{"apple", "green", "red", null};
        fruits[1] = new String[]{"banana", null, null, null};
        fruits[2] = new String[]{"grapefruit", "pink", "green", "yellow"};
        fruits[3] = new String[]{"pineapple", null, null, null};
        fruits[4] = new String[]{"strawberry", null, null, null};
        System.out.println((fruits[2][3] + " " + fruits[2][0]));

        //i2 line index/ i1 column index
        for (int i1 = 0; i1 < fruits[i1].length; i1++) {
            for (int i2 = 0; i2 < fruits.length; i2++) {
                System.out.println(fruits[i2][i1]);
            }
        }
        for (int i1 = 0; i1 < fruits.length; i1++) {
            for (int i2 = 0; i2 < fruits[i1].length; i2++) {
                System.out.println(fruits[i1][i2]);
            }
        }

    }
}
