package com.pluralsight;

import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "yearup";

        // 1. open a connection to the database
        Connection connection = DriverManager.getConnection(url,username,password);

        // create statement
        // the statement is tied to the open connection
        Statement statement = connection.createStatement();
        // define your query
        String query = "SELECT Name FROM city " +
                        "WHERE CountryCode = 'USA'";
        // 2. Execute your query
        ResultSet results = statement.executeQuery(query);

        System.out.println(results);

    }
}
