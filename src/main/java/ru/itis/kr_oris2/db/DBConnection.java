package ru.itis.kr_oris2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        }

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rzd","postgres","password");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void releaseConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
