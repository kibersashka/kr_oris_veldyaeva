package ru.itis.kr_oris2.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import ru.itis.kr_oris2.db.DBConnection;

import java.sql.SQLException;

@WebListener
public class Listener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("org.postgresql.Driver");
            DBConnection.getConnection();
        } catch (ClassNotFoundException e) {}
    }
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            DBConnection.getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
