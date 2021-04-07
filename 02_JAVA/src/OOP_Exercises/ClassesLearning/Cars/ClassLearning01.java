package OOP_Exercises.ClassesLearning.Cars;


import OOP_Exercises.ClassesLearning.Cars.Car;
import OOP_Exercises.ClassesLearning.Cars.Car01;

public class ClassLearning01 {
    public static void main(String[] args) {
        Car01 myCar = new Car01("Toyota", "Red",
                "CB 007", 18); // wywolanie konstruktora przez 'new Car()'
        System.out.println(myCar); // konkretna instancja obiektu typu Car
        System.out.println(myCar.type);
        System.out.println(myCar.id);
        System.out.println(myCar.sizeWheel);
        System.out.println(myCar.color);
        System.out.println(myCar.productionDate);
        Car01 myCar2 = new Car01("Toyota", "White",
                "CB 008", 15);
    }

}
