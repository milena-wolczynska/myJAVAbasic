package pl.sda.service;

import pl.sda.model.Person;
import pl.sda.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonService {
    /*Create a method that will return
    all people (list of objects) born before 1990 & before 2000*/

    public List<Person> getPersonBefore1990() throws SQLException {

        List<Person> persons = new ArrayList<>();

        try {
            Connection connection = JDBCUtil.getConnection();
            Statement statement = connection.createStatement();
            //statement.executeQuery("SELECT * FROM person");
            ResultSet rs = statement.executeQuery("SELECT * FROM person");

            while (rs.next()) {
                String pesel = rs.getString("pesel");

                if (isPeselOlderThan1990(pesel)) {
                    int id = rs.getInt("first_name");
                    String name = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    Person person = new Person(id, name, lastName, pesel);
                    persons.add(person);
                }
            }

            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return persons;
    }
    private boolean isPeselOlderThan1990(String pesel) {
        //int year = pesel.substring(0, 2);
        int year = Integer.parseInt(pesel.substring(0, 2)); //2 first numbers from personal ID

        return year < 90; //return true, if >= return false

    }

}
