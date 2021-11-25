package org.bridgelabz.junitdemo.sqldemo;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/batch076";
        String uname = "root";
        String pass = "pass";

        try {
            Connection connection = DriverManager.getConnection(dbURL, uname, pass);
            if (connection != null) {
                System.out.println("Connected!");
            }
            /*String sqlInsert = "INSERT INTO users (fname, lname, email) values (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sqlInsert);
            statement.setString(1, "abc");
            statement.setString(2, "xyz");
            statement.setString(3, "ax@gmail.com");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Row or data added successfully!!");
            }

            String sqlUpdate = "update users set fname=? where id=?";
            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setString(1, "pqr");
            preparedStatementUpdate.setInt(2, 2);
            int rowsEffected = preparedStatementUpdate.executeUpdate();
            if (rowsEffected > 0) {
                System.out.println("Data is updated!");
            }*/

            String sqlDelete = "DELETE FROM users WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
            preparedStatement.setInt(1, 1);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data is deleted!");
            }

            String sqlRead = "SELECT * FROM users";
            Statement readStat = connection.createStatement();
            ResultSet resultSet = readStat.executeQuery(sqlRead);
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String fname = resultSet.getString("fname");
                String lname = resultSet.getString("lname");
                String email = resultSet.getString("email");
                System.out.println(id + " | " + fname + " | "+ lname + " | "+ email);
            }

            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
