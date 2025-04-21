/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veteri_feliz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author juanj
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/veteri_feliz"; //  tu base de datos
    private static final String USER = "root"; // Cambia por tu usuario
    private static final String PASSWORD = ""; // Cambia por tu contraseña

    public static Connection getConnection() throws SQLException {
        // Cargar el driver de MySQL (opcional)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Manejo de la excepción
        }
        
        return DriverManager.getConnection(URL, USER, PASSWORD); // Devuelve la conexión a la base de datos
    }
}
