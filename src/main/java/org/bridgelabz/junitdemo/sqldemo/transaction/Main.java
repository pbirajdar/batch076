package org.bridgelabz.junitdemo.sqldemo.transaction;

import java.sql.*;

public class Main {


    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/batch076";
        String uname = "root";
        String pass = "pass";
        System.out.println(System.currentTimeMillis());

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL, uname, pass);
            if (connection != null) {
                System.out.println("Connected!");
            }
            connection.setAutoCommit(false);
            //Transaction op1
            String updateProductTable = "UPDATE product SET qty=? WHERE PID=?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateProductTable);
            preparedStatement.setInt(1, 94);
            preparedStatement.setInt(2, 1);
            int rowAffected =  preparedStatement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Data updated!!");
            }

            //Transaction op2
            String placeOrder = "insert into orders (pid, odate, total_price) values (?, ?, ?)";
            PreparedStatement statementInsertOrder = connection.prepareStatement(placeOrder);
            statementInsertOrder.setInt(1, 1);
            statementInsertOrder.setDate(2, new Date(System.currentTimeMillis()));
            statementInsertOrder.setInt(3, 20);
            rowAffected =  statementInsertOrder.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Data inserted!!");
            }
            connection.commit();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}
