package com.example.bellapizza.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String USER = "root";
    private static final String PWD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/bella_pizza";

    public static Connection abrirConexion() {

        Connection con = null;

        try {
            con = DriverManager.getConnection(URL, USER, PWD);
        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }
        return con;
    }
}
