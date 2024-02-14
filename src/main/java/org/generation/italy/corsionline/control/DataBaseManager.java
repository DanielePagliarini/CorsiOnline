package org.generation.italy.corsionline.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
    // Inserisci le tue credenziali di accesso al database
    private static final String URL = "jdbc:mysql://localhost:3306/corsi_online";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Metodo per ottenere una connessione al database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
