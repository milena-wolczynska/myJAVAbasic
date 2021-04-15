package pl.sda.statement;

import pl.sda.util.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCRUDExample {

    public static void main(String[] args) {

        String insertIntoPerson = "INSERT INTO person VALUES (4, 'Michał', 'Nowak', '97122309876')";

        String updatePerson = "UPDATE person SET pesel = '98123036954' WHERE id = 1";


    try{

        Connection connection = JDBCUtil.getConnection();

            Statement statement = connection.createStatement();

            int rowCount = statement.executeUpdate(insertIntoPerson);
        System.out.println("Upadated" + rowCount + "lines");

        connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
