/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veteri_Feliz;
import static Veteri_Feliz.ArchivoPlano.cargarDesdeArchivo;
import static Veteri_Feliz.ArchivoPlano.guardarEnArchivo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veteri_feliz.Veterinario;
/**
 *
 * @author juanj
 */
public class ArchivoPlanoVet {
    private static final String RUTA_ARCHIVO = "Veterinario.txt"; // Archivo donde se guardarán los datos
        
        public static void guardarEnArchivo(List<Veterinario> ListaVeterinario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Veterinario veterinario : ListaVeterinario) {
                // Guardamos los datos de cada estudiante separados por comas
                writer.write(veterinario.getId_Veterinario()+ "," + veterinario.getCedula_Veterinario()+ ","+veterinario.getNombre_Veterinario());
                writer.newLine(); // Escribimos una nueva línea por cada estudiante
            }
            System.out.println("Datos guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }
        
        // Método para cargar los Veterinario desde el archivo y retornar una lista
        public static List<Veterinario> cargarDesdeArchivo() {
        List<Veterinario> ListaVeterinario = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); // Dividimos la línea por comas
                int Id = Integer.parseInt(datos[0].trim());
                int Cedula = Integer.parseInt(datos[1].trim());
                String Nombre = datos[2].trim();
                
                // Creamos un nuevo estudiante y lo agregamos a la lista
                Veterinario veterinario = new Veterinario(Id, Cedula, Nombre);
                ListaVeterinario.add(veterinario);
            }
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        }
        return ListaVeterinario;
    }
        
        public static void eliminarDeArchivo(int Id) {
        List<Veterinario> ListaVeterinario = cargarDesdeArchivo();  // Cargar los estudiantes desde el archivo
        boolean eliminado = false;
        
        // Buscar y eliminar el estudiante con el documento especificado
        for (Veterinario veterinario : ListaVeterinario) {
            if (veterinario.getId_Veterinario() == Id) {
                ListaVeterinario.remove(veterinario);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            // Si se eliminó el estudiante, guardar los datos actualizados en el archivo
            guardarEnArchivo(ListaVeterinario);
            System.out.println("Veterinario eliminado correctamente.");
        } else {
            System.out.println("No se encontró un estudiante con el id: " + Id);
        }
    }
        
        public static void modificarEnArchivo(int Id, int nuevaCedula, String nuevoNombre) {
    List<Veterinario> ListaVeterinario = cargarDesdeArchivo();
    boolean modificado = false;

    for (Veterinario veterinario : ListaVeterinario) {
        if (veterinario.getId_Veterinario() == Id || veterinario.getCedula_Veterinario() == nuevaCedula) {
            // Validar si los nuevos datos ya existen en otro registro (nombre/apellido iguales)
            for (Veterinario otra : ListaVeterinario) {
                if (otra != veterinario && otra.getNombre_Veterinario().equalsIgnoreCase(nuevoNombre)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un registro con esos datos.");
                    return;
                }
            }

            veterinario.setCedula_Veterinario(nuevaCedula);
            veterinario.setNombre_Veterinario(nuevoNombre);
            modificado = true;
            break;
        }
    }

    if (modificado) {
        guardarEnArchivo(ListaVeterinario);
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un registro con ese ID.");
    }
    }
}
