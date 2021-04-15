package pl.sda.statement;

import pl.sda.util.JDBCUtil;

import java.sql.*;

public class JDBCStatementExample {


    public static void main(String[] args) {

        try {

            Connection connection = JDBCUtil.getConnection();
            //Connection connection = DriverManager.getConnection(CONNECTION_URL, DB_USER, DB_PASSWORD);

            Statement statement = connection.createStatement();

            //int rowNumbers = statement.executeUpdate("SELECT * FROM person");

            ResultSet rs = statement.executeQuery("SELECT * FROM person");

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

            connection.close();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
