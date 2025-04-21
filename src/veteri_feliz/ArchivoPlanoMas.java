/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veteri_feliz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veteri_feliz.Mascota;

/**
 *
 * @author juanj
 */
public class ArchivoPlanoMas {
    private static final String RUTA_ARCHIVO = "Mascota.txt"; // Archivo donde se guardarán los datos
      
    // Método para guardar la lista de estudiantes en un archivo

    public static void guardarEnArchivo(List<Mascota> ListaMascota) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Mascota mascota : ListaMascota) {
                // Guardamos los datos de cada estudiante separados por comas
                writer.write(mascota.getID()+ "," + mascota.getNombre_Mascota()+ ","+mascota.getEspecie()+","+ mascota.getRaza()+","+mascota.getColor()+","+mascota.getFecha_N()+","+mascota.getPeso());
                writer.newLine(); // Escribimos una nueva línea por cada estudiante
            }
            System.out.println("Datos guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

    
    // Método para cargar los estudiantes desde el archivo y retornar una lista
        public static List<Mascota> cargarDesdeArchivo() {
        List<Mascota> ListaMascota = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); // Dividimos la línea por comas
                int ID = Integer.parseInt(datos[0].trim());
                String NombreMascota = datos[1].trim();
                String Especie = datos[2].trim();
                String Raza = datos[3].trim();
                String Color = datos[4].trim();
                String Fecha_N = datos[5].trim();
                int Peso = Integer.parseInt(datos[6].trim());
                
                // Creamos un nuevo estudiante y lo agregamos a la lista
                Mascota mascota = new Mascota(ID, NombreMascota, Especie, Raza, Color, Fecha_N, Peso);
                ListaMascota.add(mascota);
            }
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        }
        return ListaMascota;
    } 
    
    // Método para eliminar un estudiante del archivo por documento
    public static void eliminarDeArchivo(int Id) {
        List<Mascota> ListaMascota = cargarDesdeArchivo();  // Cargar los estudiantes desde el archivo
        boolean eliminado = false;

        // Buscar y eliminar el estudiante con el documento especificado
        for (Mascota mascota : ListaMascota) {
            if (mascota.getID() == Id) {
                ListaMascota.remove(mascota);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            // Si se eliminó el estudiante, guardar los datos actualizados en el archivo
            guardarEnArchivo(ListaMascota);
            System.out.println("Persona eliminado correctamente.");
        } else {
            System.out.println("No se encontró una persona con el ID: " + Id);
        }
    }

    public static void modificarEnArchivo(int Id, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor, String nuevaFechaN, int nuevoPeso) {
    List<Mascota> ListaMascota = cargarDesdeArchivo();
    boolean modificado = false;

    for (Mascota mascota : ListaMascota) {
        if (mascota.getID() == Id) {
            // Validar si los nuevos datos ya existen en otro registro (nombre/apellido iguales)
            for (Mascota otra : ListaMascota) {
                if (otra != mascota && otra.getNombre_Mascota().equalsIgnoreCase(nuevoNombre)
                        && otra.getEspecie().equalsIgnoreCase(nuevaEspecie)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un registro con esos datos.");
                    return;
                }
            }

            mascota.setNombre_Mascota(nuevoNombre);
            mascota.setEspecie(nuevaEspecie);
            mascota.setRaza(nuevaRaza);
            mascota.setColor(nuevoColor);
            mascota.setFecha_N(nuevaFechaN);
            mascota.setPeso(nuevoPeso);
            modificado = true;
            break;
        }
    }

    if (modificado) {
        guardarEnArchivo(ListaMascota);
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un registro con esa cédula.");
    }
    }
}
