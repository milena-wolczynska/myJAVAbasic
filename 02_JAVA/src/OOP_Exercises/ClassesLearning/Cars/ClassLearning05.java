package OOP_Exercises.ClassesLearning.Cars;

public class ClassLearning05 {
    public static void main(String[] args) {
        Car05 myCar = new Car05("Toyota", "Red",
                "CB 007", 18); // wywolanie konstruktora przez 'new Car()'
        System.out.println(myCar); // konkretna instancja obiektu typu Car
        System.out.println(myCar.getType());
        System.out.println(myCar.getId());
        System.out.println(myCar.getSizeWheel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getProductionDate());
//        System.out.println(myCar.);
        System.out.println(myCar.runCar());
        myCar.setColor("Blue"); // zmieniam kolor na tej instancji auta !
        System.out.println(myCar.getColor()); // auto ma nowy kolor !!
        Car05 myCar2 = new Car05("Toyota", "White",
                "CB 008", 15);
    }
}
