package OOP_Exercises.ClassesLearning.StaticNonstatic;


public class ExampleCar {
    private String color;
    private int maxSpeed;
    private String brand;
    private int horses;
    public void setColor(String c) { // String c = "red";
        this.color = c;
    }
    public void setMaxSpeed(int max) {
        maxSpeed = max; // ==  this.maxSpeed = max;  # this jest dopisywane przy kompilacji wiec mozna traktowac jako domyslne
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setHorses(int h) {
        horses = h;
    }
    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", color, maxSpeed, brand));
    }
    public class Main {
        public void main(String[] args) {
            ExampleCar car = new ExampleCar();
            car.setColor("red");
            car.setBrand("toyota");
            car.setMaxSpeed(200);
            car.setHorses(130);
            car.printCarParameters();
        }
    }


}
