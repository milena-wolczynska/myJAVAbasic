package OOP_Exercises.ClassesLearning.Cars;


import java.util.Date;

public class Car {
    // attributes / fields
    String type;
    String color;
    String id;
    Date productionDate;
    //    int sizeWheel; // primitive type
    Integer sizeWheel; // object type

    public static void main(String[] args) {
        Car myCar = new Car(); // wywolanie konstruktora przez 'new Car()'
        System.out.println(myCar);
    }


}
