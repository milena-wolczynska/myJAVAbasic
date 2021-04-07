package OOP_Exercises.ClassesLearning.Cars;


import java.sql.Date;
import java.time.LocalDate;

public class Car01 {
    // extends Object
    // attributes / fields
    String type; // = null;
    String color; // = null;
    String id;
    Date productionDate;
    //    public int sizeWheel; // primitive type
    Integer sizeWheel; // object type
    public Car01() { // constructor
    }
    public Car01(String myType, String myColor,
               String id, Integer mySizeWheel) { // constructor
        type = myType; // this.type
        this.color = myColor;
        this.id = id;
        this.productionDate = Date.valueOf(LocalDate.now());
        this.sizeWheel = mySizeWheel;
    }
    public Car01(String myType, String myColor,
               Date myDateProduction,
               String id, Integer mySizeWheel) { // constructor
        type = myType; // this.type
        this.color = myColor;
        this.id = id;
        this.productionDate = myDateProduction;
        this.sizeWheel = mySizeWheel;
    }


}
