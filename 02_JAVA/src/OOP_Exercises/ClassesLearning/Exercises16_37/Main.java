package OOP_Exercises.ClassesLearning.Exercises16_37;

import OOP_Exercises.ClassesLearning.Exercises16_37.animals.Elephant;
import OOP_Exercises.ClassesLearning.Exercises16_37.animals.Monkey;
import OOP_Exercises.ClassesLearning.Exercises16_37.zooCorporation.Employee;
import OOP_Exercises.ClassesLearning.Exercises16_37.zooCorporation.Zoo;

public class Main {
    //Create a class with the fields name, surname, age
    public static void main(String[] args) {
        Elephant.typicalPlayTrunk();
        Elephant elephant = new Elephant(124, 3050, 1, 2, true, true, true);
        System.out.println(elephant);

        elephant.setHealthy(false);
        elephant.animalName = "Trąbalski";
        System.out.println(elephant);

        Monkey monkey1 = new Monkey(123, (short) 2, 1, 2, 15.5, "uhahah", 1.3, "brown", true);
        Monkey monkey2 = new Monkey(124, (short) 2, 1, 2, 16.5, "uhihih", 1.4, "black", true,
                false, "Mambo");
        System.out.println(monkey1);
        System.out.println(monkey2);


        System.out.println(Employee.sayHello("John"));


        Employee employee = new Employee(19, "Konstanty", "Coal", "uniform", (short) 10,
                3, true, (long) 3500, "Monkeys", "Male");
        System.out.println(employee);

        Employee employee1 = new Employee(34, "Jennifer", "Fisher", "uniform", (short) 10,
                3, true, (long) 8500, "Elephants", "Female");

        Employee employee2 = new Employee(42, "Ted", "Jrs", "uniform", (short) 10,
                3, false, (long) 4000, "Monkeys", "Male");

        Monkey monkey3 = new Monkey(125, (short) 2, 1, 2, 19.5d, "Uaaa", 28.7d, "brown", false);
        Monkey monkey4 = new Monkey(126, (short) 2, 1, 2, 20.9d, "Uaaa", 35.7d, "white", true);
        Elephant elephant1 = new Elephant(234, 3500, 1, 2, true, true, true);
        Elephant elephant2 = new Elephant(235, 3200, 1, 1, false, true, true);


        Employee[] employees = new Employee[]
                {employee, employee1, employee2
                };
        Monkey[] monkeys = new Monkey[]{
                monkey1, monkey2, monkey3, monkey4
        };
        Elephant[] elephants = new Elephant[]{
                elephant1, elephant2
        };
        Zoo zoo = new Zoo(20, 19.99d, (short) 20, 20.5f,
                "Small Safari", employees, monkeys, elephants);
        zoo.setParkingSpots(25);
        System.out.println(zoo);
        System.out.println(zoo.animalsNumberChecker());
        Zoo.defaultHello();
        System.out.println(employee.sayHello("Jenny"));
    }

}

