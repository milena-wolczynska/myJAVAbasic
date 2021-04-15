package pl.sda.preparedStatement;

import pl.sda.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPreparedStatementExample {

    public static void main(String[] args) {


        String selectFromPerson = "SELECT * FROM person WHERE last_name = ?";
        String updatePerson = "UPDATE person SET last_name WHERE id = 1";

        try {

            Connection connection = JDBCUtil.getConnection();

            PreparedStatement psUpdate= connection.prepareStatement(updatePerson);
            psUpdate.setString(1, "Kowalsky");
            psUpdate.setInt(4, 2);
            psUpdate.executeUpdate();


            PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT * FROM person WHERE last_name = ?");

            preparedStatement.setString(1, "Kowalsky"); //first sign ? changed to second parameter

            ResultSet rs = preparedStatement.executeQuery();

            int counter = 0;

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String pesel = rs.getString("pesel");

                System.out.println(id+ " " + name + lastName + pesel);
                counter++;
            }

            System.out.println("number of lines in the Person table" + rs);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}