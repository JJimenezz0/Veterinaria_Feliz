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

/**
 *
 * @author juanj
 */
public class ArchivoPlanoHis {
    private static final String RUTA_ARCHIVO = "Historial.txt"; // Archivo donde se guardarán los datos
      
    // Método para guardar la lista de estudiantes en un archivo

    public static void guardarEnArchivo(List<Historia_Clinica> ListaClinica) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Historia_Clinica hclinica : ListaClinica) {
                // Guardamos los datos de cada estudiante separados por comas
                writer.write(hclinica.getId_Visita()+ "," + hclinica.getFecha_Visita()+ ","+hclinica.getMotivo()+","+hclinica.getID()+","+hclinica.getNombre_Mascota()
                +","+hclinica.getEspecie()+","+hclinica.getRaza()+","+hclinica.getColor()+","+hclinica.getFecha_N()+","+hclinica.getPeso());
                writer.newLine(); // Escribimos una nueva línea por cada estudiante
            }
            System.out.println("Datos guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

    
    // Método para cargar los estudiantes desde el archivo y retornar una lista
        public static List<Historia_Clinica> cargarDesdeArchivo() {
        List<Historia_Clinica> ListaClinica = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); // Dividimos la línea por comas
                int Id_Visita = Integer.parseInt(datos[0].trim());
                String Fecha_Visita = datos[1].trim();
                String Motivo = datos[2].trim();
                int ID = Integer.parseInt(datos[3].trim());
                String Nombre_Mascota = datos[4].trim();
                String Especie = datos[5].trim();
                String Raza = datos[6].trim();
                String Color = datos[7].trim();
                String Fecha_N = datos[8].trim();
                int Peso = Integer.parseInt(datos[9].trim());
                
                // Creamos un nuevo estudiante y lo agregamos a la lista
                Historia_Clinica hclinica = new Historia_Clinica(Id_Visita,Fecha_Visita,Motivo,ID,Nombre_Mascota,Especie,Raza,Color,Fecha_N,Peso);
                ListaClinica.add(hclinica);
            }
            System.out.println("Datos cargados correctamente desde el archivo.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        }
        return ListaClinica;
    } 
    
    // Método para eliminar un estudiante del archivo por documento
    public static void eliminarDeArchivo(int Id_Visita) {
        List<Historia_Clinica> ListaClinica = cargarDesdeArchivo();  // Cargar los estudiantes desde el archivo
        boolean eliminado = false;

        // Buscar y eliminar el estudiante con el documento especificado
        for (Historia_Clinica hclinica : ListaClinica) {
            if (hclinica.getId_Visita() == Id_Visita) {
                ListaClinica.remove(hclinica);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            // Si se eliminó el estudiante, guardar los datos actualizados en el archivo
            guardarEnArchivo(ListaClinica);
            System.out.println("Vacuna eliminada correctamente.");
        } else {
            System.out.println("No se encontró un registro con el ID: " + Id_Visita);
        }
    }

    public static void modificarEnArchivo(int NuevoIdVisita, int NuevoID,int NuevoPeso, String NuevaFecha, String NuevoMotivo, String NuevaMascota, String NuevaEspecie, String NuevaRaza, String NuevoColor, String NuevoFechaN) {
    List<Historia_Clinica> ListaClinica = cargarDesdeArchivo();
    boolean modificado = false;

    for (Historia_Clinica hclinica : ListaClinica) {
        if (hclinica.getId_Visita() == NuevoIdVisita) {
            // Validar si los nuevos datos ya existen en otro registro (nombre/apellido iguales)
            for (Historia_Clinica otra : ListaClinica) {
                if (otra != hclinica && otra.getNombre_Mascota().equalsIgnoreCase(NuevaMascota)
                        && otra.getEspecie().equalsIgnoreCase(NuevaEspecie)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un registro con esos datos.");
                    return;
                }
            }

            hclinica.setId_Visita(NuevoIdVisita);
            hclinica.setID(NuevoID);
            hclinica.setPeso(NuevoPeso);
            hclinica.setFecha_Visita(NuevaFecha);
            hclinica.setMotivo(NuevoMotivo);
            hclinica.setNombre_Mascota(NuevaMascota);
            hclinica.setEspecie(NuevaEspecie);
            hclinica.setRaza(NuevaRaza);
            hclinica.setColor(NuevoColor);
            hclinica.setFecha_N(NuevoFechaN);
            modificado = true;
            break;
        }
    }

    if (modificado) {
        guardarEnArchivo(ListaClinica);
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un registro con ese Codigo.");
    }
    }
}
