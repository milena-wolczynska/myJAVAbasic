package OOP_Exercises.ClassesLearning.Exercises16_37.zooCorporation;

import OOP_Exercises.ClassesLearning.Exercises16_37.animals.Elephant;
import OOP_Exercises.ClassesLearning.Exercises16_37.animals.Monkey;

import java.util.Arrays;

public class Zoo {
    private int parkingSpots;
    private double ticketPrice;
    private short numberOfCages;
    private float area;
    private String zooName;
    //attributes as composition
    //employee table
    private Employee[] employees;
    private Monkey[] monkeys;
    private Elephant[] elephants;

    //zoo constructor, includes all attributes of this class and tables
    public Zoo(int spots, double price, short cages, float area, String name,
               Employee[] employees, Monkey[] monkeys, Elephant[] elephants) {
        this.parkingSpots = spots;
        this.ticketPrice = price;
        this.numberOfCages = cages;
        this.area = area;
        this.zooName = name;
        this.employees = employees;
        this.monkeys = monkeys;
        this.elephants = elephants;
    }

    public void setParkingSpots(int parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getParkingSpots() {
        return parkingSpots;
    }

    public int animalsNumberChecker() {
        //sum of animals
        return this.monkeys.length + this.elephants.length;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public short getNumberOfCages() {
        return numberOfCages;
    }

    public void setNumberOfCages(short numberOfCages) {
        this.numberOfCages = numberOfCages;
    }

    public float getArea() {
        return area;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Monkey[] getMonkeys() {
        return monkeys;
    }

    public void setMonkeys(Monkey[] monkeys) {
        this.monkeys = monkeys;
    }

    public Elephant[] getElephants() {
        return elephants;
    }

    public void setElephants(Elephant[] elephants) {
        this.elephants = elephants;
    }

    public static void defaultHello(){
        System.out.println("hello everybody ");
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "parkingSpots=" + parkingSpots +
                ", ticketPrice=" + ticketPrice +
                ", numberOfCages=" + numberOfCages +
                ", area=" + area +
                ", zooName='" + zooName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", monkeys=" + Arrays.toString(monkeys) +
                ", elephants=" + Arrays.toString(elephants) +
                '}';
    }
}
