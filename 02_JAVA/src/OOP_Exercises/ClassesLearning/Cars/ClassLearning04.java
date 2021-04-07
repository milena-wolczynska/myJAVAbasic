package OOP_Exercises.ClassesLearning.Cars;

public class ClassLearning04 {
    public static void main(String[] args) {
        Car04 myCar = new Car04("Toyota", "Red",
                "CB 007", 18); // wywolanie konstruktora przez 'new Car()'
        System.out.println(myCar); // konkretna instancja obiektu typu Car
        System.out.println(myCar.getType());
        System.out.println(myCar.getId());
        System.out.println(myCar.getSizeWheel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getProductionDate());
//        System.out.println(myCar.);
        System.out.println(myCar.runCar());
        Car04 myCar2 = new Car04("Toyota", "White",
                "CB 008", 15);
    }
}
