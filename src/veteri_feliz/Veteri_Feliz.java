/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veteri_feliz;

import java.sql.Connection;
import java.sql.SQLException;
import static veteri_feliz.DatabaseConnection.getConnection;

/**
 *
 * @author juanj
 */
public class Veteri_Feliz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime el error si la conexión falla
        }
        
        MainMenu mainmenu = new MainMenu(); // Crear una instancia del formulario
        mainmenu.setVisible(true);
    }
    
}
