package OOP_Exercises.ClassesLearning.Cars;

import java.sql.Date;
import java.time.LocalDate;

public class Car02 {
    // extends Object
    // attributes / fields
    String type; // = null;
    String color; // = null;
    String id;
    Date productionDate;
    //    public int sizeWheel; // primitive type
    Integer sizeWheel; // object type
    public Car02() { // constructor
    }
    // String myType = "Toyota", String myColor = "Red",
    public Car02(String myType, String myColor,
               // String id = "CB 007", Integer mySizeWheel = 18
               String id, Integer mySizeWheel) { // constructor
        type = myType; // this.type
        this.color = myColor;
        this.id = id;
        this.productionDate = Date.valueOf(LocalDate.now());
        this.sizeWheel = mySizeWheel;
    }
    public Car02(String myType, String myColor,
               Date myDateProduction,
               String id, Integer mySizeWheel) { // constructor
        type = myType; // this.type
        this.color = myColor;
        this.id = id;
        this.productionDate = myDateProduction;
        this.sizeWheel = mySizeWheel;
    }
    public static void main(String[] args) {
        Car02 myCar = new Car02("Toyota", "Red",
                "CB 007", 18); // wywolanie konstruktora przez 'new Car()'
        System.out.println(myCar); // konkretna instancja obiektu typu Car
        System.out.println(myCar.type);
        System.out.println(myCar.id);
        System.out.println(myCar.sizeWheel);
        System.out.println(myCar.color);
        System.out.println(myCar.productionDate);
        Car02 myCar2 = new Car02("Toyota", "White",
                "CB 008", 15);
    }
}
