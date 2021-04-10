package OOP_Exercises.ClassesLearning.Exercises16_37.zooCorporation;

public class Employee {
    //static means can do method or variable without creating of object
    public static final String DEFAULT_HELLO = "hi";
    private int idEmployee;
    private String nameEmployee;
    private String surnameEmployee;
    private String outfitEmployee;
    private short numbersOfFingers;
    private int seniority;
    private boolean isFullTime;
    private long salary;
    private String specialization;
    private String sex;
    public String nicknameEmployee;

    //constructors
    public Employee(int idEmployee, String nameEmployee, String surnameEmployee, String outfitEmployee,
                    short numbersOfFingers, int seniority, boolean isFullTime, long salary, String specialization,
                    String sex) {
        // przypisanie pól
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.outfitEmployee = outfitEmployee;
        this.numbersOfFingers = numbersOfFingers;
        this.seniority = seniority;
        this.isFullTime = isFullTime;
        this.salary = salary;
        this.specialization = specialization;
        this.sex = sex;
    }

    public Employee(int idEmployee, String nameEmployee, String surnameEmployee, String outfitEmployee,
                    short numbersOfFingers, int seniority, boolean isFullTime, long salary, String specialization,
                    String sex, String nicknameEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.outfitEmployee = outfitEmployee;
        this.numbersOfFingers = numbersOfFingers;
        this.seniority = seniority;
        this.isFullTime = isFullTime;
        this.salary = salary;
        this.specialization = specialization;
        this.sex = sex;
        this.nicknameEmployee = nicknameEmployee;
    }

    public void readyToWork() {
        System.out.println("i'm ready to work ");
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public String getOutfitEmployee() {
        return outfitEmployee;
    }

    public void setOutfitEmployee(String outfitEmployee) {
        this.outfitEmployee = outfitEmployee;
    }

    public short getNumbersOfFingers() {
        return numbersOfFingers;
    }

    public void setNumbersOfFingers(short numbersOfFingers) {
        this.numbersOfFingers = numbersOfFingers;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public long getSalary() {
        return salary;
    }
    //if salary is true, return salary
    public void setSalary(long salary) {
        if(salaryChecker(salary))
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //do salary method, visible only into class
    private boolean salaryChecker(long salary){
        if (salary < 10450){
            return false;
        }
        return true;
    }

    public static String sayHello(String nameEmployee) {
        return DEFAULT_HELLO + " " + nameEmployee;


    }
    //domyślny opis cech mojego obiektu
    @Override
    public String toString() {
        super.toString();
        //System.out.println(super.toString());
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", surnameEmployee='" + surnameEmployee + '\'' +
                ", outfitEmployee='" + outfitEmployee + '\'' +
                ", numbersOfFingers=" + numbersOfFingers +
                ", seniority=" + seniority +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                ", specialization='" + specialization + '\'' +
                ", sex='" + sex + '\'' +
                ", nicknameEmployee='" + nicknameEmployee + '\'' +
                '}';
    }
}
