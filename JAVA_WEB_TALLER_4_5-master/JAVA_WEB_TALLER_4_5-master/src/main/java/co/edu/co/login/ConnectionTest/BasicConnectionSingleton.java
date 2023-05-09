package co.edu.co.login.ConnectionTest;

import java.sql.*;
public class BasicConnectionSingleton {
        private static String url ="jdbc:mysql://localhost:3306/afhc?serverTimezone=America/Bogota";
        private static String user = "andresherco21";
        private static String pass = "Emerica100";
        private static Connection conn;
        public static Connection getInstance()
                throws SQLException {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user,pass);
            }
            return conn;
        }
    } // BasicConnectionSingleton


