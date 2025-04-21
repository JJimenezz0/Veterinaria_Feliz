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
import veteri_feliz.Historial_Vacunas;

/**
 *
 * @author juanj
 */
public class ArchivoPlanoVac {
    private static final String RUTA_ARCHIVO = "Vacunas.txt"; // Archivo donde se guardarán los datos
      
    // Método para guardar la lista de estudiantes en un archivo

    public static void guardarEnArchivo(List<Historial_Vacunas> ListaHVacunas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Historial_Vacunas Hvacunas : ListaHVacunas) {
                // Guardamos los datos de cada estudiante separados por comas
                writer.write(Hvacunas.getFecha_Vacuna()+ "," + Hvacunas.getCodigo_Vacuna()+ ","+Hvacunas.getNombre_Vacuna());
                writer.newLine(); // Escribimos una nueva línea por cada estudiante
            }
            System.out.println("Datos guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

    
    // Método para cargar los estudiantes desde el archivo y retornar una lista
        public static List<Historial_Vacunas> cargarDesdeArchivo() {
        List<Historial_Vacunas> ListaHVacunas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); // Dividimos la línea por comas
                int CodigoMascota = Integer.parseInt(datos[1].trim());
                String Fecha = datos[0].trim();
                String NombreVacuna = datos[2].trim();
                
                // Creamos un nuevo estudiante y lo agregamos a la lista
                Historial_Vacunas hvacunas = new Historial_Vacunas(Fecha,CodigoMascota,NombreVacuna);
                ListaHVacunas.add(hvacunas);
            }
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        }
        return ListaHVacunas;
    } 
    
    // Método para eliminar un estudiante del archivo por documento
    public static void eliminarDeArchivo(int nombre_Vacuna) {
        List<Historial_Vacunas> ListaHVacunas = cargarDesdeArchivo();  // Cargar los estudiantes desde el archivo
        boolean eliminado = false;

        // Buscar y eliminar el estudiante con el documento especificado
        for (Historial_Vacunas hvacunas : ListaHVacunas) {
            if (hvacunas.getCodigo_Vacuna() == nombre_Vacuna) {
                ListaHVacunas.remove(hvacunas);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            // Si se eliminó el estudiante, guardar los datos actualizados en el archivo
            guardarEnArchivo(ListaHVacunas);
            System.out.println("Vacuna eliminada correctamente.");
        } else {
            System.out.println("No se encontró una Vacuna con el Nombre: " + nombre_Vacuna);
        }
    }

    public static void modificarEnArchivo(int NuevoCodigoMascota, String NuevaFecha, String NuevaVacuna) {
    List<Historial_Vacunas> ListaHVacunas = cargarDesdeArchivo();
    boolean modificado = false;

    for (Historial_Vacunas hvacunas : ListaHVacunas) {
        if (hvacunas.getCodigo_Vacuna() == NuevoCodigoMascota) {
            // Validar si los nuevos datos ya existen en otro registro (nombre/apellido iguales)
            for (Historial_Vacunas otra : ListaHVacunas) {
                if (otra != hvacunas && otra.getNombre_Vacuna().equalsIgnoreCase(NuevaVacuna)
                        && otra.getFecha_Vacuna().equalsIgnoreCase(NuevaFecha)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un registro con esos datos.");
                    return;
                }
            }

            hvacunas.setCodigo_Vacuna(NuevoCodigoMascota);
            hvacunas.setNombre_Vacuna(NuevaVacuna);
            hvacunas.setFecha_Vacuna(NuevaFecha);
            modificado = true;
            break;
        }
    }

    if (modificado) {
        guardarEnArchivo(ListaHVacunas);
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un registro con ese Codigo.");
    }
    }
}
