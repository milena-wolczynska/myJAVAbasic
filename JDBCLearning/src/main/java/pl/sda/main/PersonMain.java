package pl.sda.main;

import pl.sda.model.Person;
import pl.sda.service.PersonService;

import java.sql.SQLException;

public class PersonMain {

    public static void main(String[] args) throws SQLException {

        PersonService personService = new PersonService();

        personService.getPersonBefore1990()
                .stream()
                .forEach(System.out::println);
    }
}
