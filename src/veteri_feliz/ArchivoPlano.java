/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veteri_Feliz;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veteri_feliz.Persona;
/**
 *
 * @author Filthier
 */
public class ArchivoPlano {
    
      private static final String RUTA_ARCHIVO = "Persona.txt"; // Archivo donde se guardarán los datos
      
    // Método para guardar la lista de estudiantes en un archivo

    public static void guardarEnArchivo(List<Persona> ListaPersona) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Persona persona : ListaPersona) {
                // Guardamos los datos de cada estudiante separados por comas
                writer.write(persona.getCedula()+ "," + persona.getNombre()+ ","+persona.getApellido());
                writer.newLine(); // Escribimos una nueva línea por cada estudiante
            }
            System.out.println("Datos guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

    
    // Método para cargar los estudiantes desde el archivo y retornar una lista
        public static List<Persona> cargarDesdeArchivo() {
        List<Persona> ListaPersona = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); // Dividimos la línea por comas
                int Cedula = Integer.parseInt(datos[0].trim());
                String Nombre = datos[1].trim();
                String Apellido = datos[2].trim();
                
                // Creamos un nuevo estudiante y lo agregamos a la lista
                Persona persona = new Persona(Cedula, Nombre, Apellido);
                ListaPersona.add(persona);
            }
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        }
        return ListaPersona;
    } 
    
    // Método para eliminar un estudiante del archivo por documento
    public static void eliminarDeArchivo(int Cedula) {
        List<Persona> ListaPersona = cargarDesdeArchivo();  // Cargar los estudiantes desde el archivo
        boolean eliminado = false;

        // Buscar y eliminar el estudiante con el documento especificado
        for (Persona persona : ListaPersona) {
            if (persona.getCedula() == Cedula) {
                ListaPersona.remove(persona);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            // Si se eliminó el estudiante, guardar los datos actualizados en el archivo
            guardarEnArchivo(ListaPersona);
            System.out.println("Persona eliminado correctamente.");
        } else {
            System.out.println("No se encontró una persona con el documento: " + Cedula);
        }
    }

    public static void modificarEnArchivo(int cedula, String nuevoNombre, String nuevoApellido) {
    List<Persona> ListaPersona = cargarDesdeArchivo();
    boolean modificado = false;

    for (Persona persona : ListaPersona) {
        if (persona.getCedula() == cedula) {
            // Validar si los nuevos datos ya existen en otro registro (nombre/apellido iguales)
            for (Persona otra : ListaPersona) {
                if (otra != persona && otra.getNombre().equalsIgnoreCase(nuevoNombre)
                        && otra.getApellido().equalsIgnoreCase(nuevoApellido)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un registro con esos datos.");
                    return;
                }
            }

            persona.setNombre(nuevoNombre);
            persona.setApellido(nuevoApellido);
            modificado = true;
            break;
        }
    }

    if (modificado) {
        guardarEnArchivo(ListaPersona);
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un registro con esa cédula.");
    }
    }
}
