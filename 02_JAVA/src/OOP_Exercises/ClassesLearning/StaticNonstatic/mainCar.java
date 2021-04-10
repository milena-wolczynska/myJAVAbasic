package OOP_Exercises.ClassesLearning.StaticNonstatic;

public class mainCar {
        public static void main(String[] args) {
            ExampleCar car = new ExampleCar();
            car.setColor("red");
            car.setBrand("toyota");
            car.setMaxSpeed(200);
            car.setHorses(130);
            car.printCarParameters();
    }
}
