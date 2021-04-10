package OOP_Exercises.ClassesLearning.ClassExamples;

public class Auto {
    private String color;
    private String brand;
    public Auto() {}
    public Auto(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Auto attributes => Color: '" + this.color + "', brand: '" +  this.brand + "'";
    }
}
