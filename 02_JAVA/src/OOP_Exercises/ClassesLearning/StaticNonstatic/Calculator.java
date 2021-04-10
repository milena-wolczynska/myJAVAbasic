package OOP_Exercises.ClassesLearning.StaticNonstatic;

public class Calculator {
    private String typeName; // default is null
    public Calculator(String typeName){
        this.typeName = typeName; // here we init the calc type
    }
    // to moze byc metoda statyczna bo nie uzywamy pól/atrybutów klasy czyli tutaj typeName
    public static int addTwoNumb(int a, int b){
        String myTypeName = "aaa";
        return a + b;
    }
    public static int addTwoNumbWithType(int a, int b, String type){
        String myTypeName = type;
        System.out.println("Type name:" + myTypeName);
        return a + b;
    }
    public String getTypeName() {
        return this.typeName;
    }
    // Odwolujemy sie do atrybutu klasy
    public int addTwoNumbAndPrintCalcType(int a, int b){
        System.out.println("Type name:" + this.typeName);
        return a + b;
    }
    public class MainCalc {
        public /*static*/ void main(String[] args) {
            // metody nie statyczne - czyli na obiekcie
            Calculator calculator = new Calculator("cisco");
            System.out.println(calculator.addTwoNumbAndPrintCalcType(1,2));;
            System.out.println(calculator.getTypeName());
            System.out.println("==============");
            // metody statyczne czyli mzona nuzyc bez obiektu
            System.out.println(Calculator.addTwoNumb(1,3));
            System.out.println(Calculator.addTwoNumbWithType(1,4, "china"));
        }
    }

}
