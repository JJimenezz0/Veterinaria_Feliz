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
import veteri_feliz.Cita;

/**
 *
 * @author juanj
 */
public class ArchivoPlanoCit {
    private static final String RUTA_ARCHIVO = "Cita.txt"; // Archivo donde se guardarán los datos
      
    // Método para guardar la lista de estudiantes en un archivo

    public static void guardarEnArchivo(List<Cita> ListaCita) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Cita cita : ListaCita) {
                // Guardamos los datos de cada estudiante separados por comas
                writer.write(cita.getCodigo_Cita()+ "," + cita.getCodigo_Mascota()+ ","+cita.getFecha_Cita()+","+cita.getHora_Cita()+","+cita.getVeterinario());
                writer.newLine(); // Escribimos una nueva línea por cada estudiante
            }
            System.out.println("Datos guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

    
    // Método para cargar los estudiantes desde el archivo y retornar una lista
        public static List<Cita> cargarDesdeArchivo() {
        List<Cita> ListaCita = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); // Dividimos la línea por comas
                int Codigo_Cita = Integer.parseInt(datos[0].trim());
                int Codigo_Mascota = Integer.parseInt(datos[1].trim());
                String Fecha_Cita = datos[2].trim();
                String Hora_Cita = datos[3].trim();
                String Veterinario = datos[4].trim();
                
                // Creamos un nuevo estudiante y lo agregamos a la lista
                Cita cita = new Cita(Codigo_Cita,Codigo_Mascota,Fecha_Cita,Hora_Cita,Veterinario);
                ListaCita.add(cita);
            }
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        }
        return ListaCita;
    } 
    
    // Método para eliminar un estudiante del archivo por documento
    public static void eliminarDeArchivo(int Codigo_Cita) {
        List<Cita> ListaCita = cargarDesdeArchivo();  // Cargar los estudiantes desde el archivo
        boolean eliminado = false;

        // Buscar y eliminar el estudiante con el documento especificado
        for (Cita cita : ListaCita) {
            if (cita.getCodigo_Cita() == Codigo_Cita) {
                ListaCita.remove(cita);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            // Si se eliminó el estudiante, guardar los datos actualizados en el archivo
            guardarEnArchivo(ListaCita);
            System.out.println("Cita eliminada correctamente.");
        } else {
            System.out.println("No se encontró una cita con el Codigo: " + Codigo_Cita);
        }
    }

    public static void modificarEnArchivo(int NuevoCodigoCita, int NuevoCodigoMascota, String NuevaFecha, String NuevaHora, String Veterinario) {
    List<Cita> ListaCita = cargarDesdeArchivo();
    boolean modificado = false;

    for (Cita cita : ListaCita) {
        if (cita.getCodigo_Cita() == NuevoCodigoCita) {
            // Validar si los nuevos datos ya existen en otro registro (nombre/apellido iguales)
            for (Cita otra : ListaCita) {
                if (otra != cita && otra.getVeterinario().equalsIgnoreCase(Veterinario)
                        && otra.getFecha_Cita().equalsIgnoreCase(NuevaFecha)&&otra.getHora_Cita().equalsIgnoreCase(NuevaHora)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un registro con esos datos.");
                    return;
                }
            }

            cita.setCodigo_Cita(NuevoCodigoCita);
            cita.setCodigo_Mascota(NuevoCodigoMascota);
            cita.setFecha_Cita(NuevaFecha);
            cita.setHora_Cita(NuevaHora);
            cita.setVeterinario(Veterinario);
            modificado = true;
            break;
        }
    }

    if (modificado) {
        guardarEnArchivo(ListaCita);
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un registro con esa cédula.");
    }
    }
}
