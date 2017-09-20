package io.drewbot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("org.sqlite.JDBC");

        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:atm.db")) {

        } catch (SQLException e) {
            System.out.println("We encountered a problem connecting to the database");
            e.printStackTrace();
        }

    }
}
