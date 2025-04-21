/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veteri_feliz;

import java.util.Date;

/**
 *
 * @author juanj
 */
public class Historial_Vacunas {
    String Fecha_Vacuna;
    int Codigo_Vacuna;
    String Nombre_Vacuna;

    public Historial_Vacunas(String Fecha_Vacuna, int Codigo_Vacuna, String Nombre_Vacuna) {
        this.Fecha_Vacuna = Fecha_Vacuna;
        this.Codigo_Vacuna = Codigo_Vacuna;
        this.Nombre_Vacuna = Nombre_Vacuna;
    }

    public Historial_Vacunas() {
    }

    public String getFecha_Vacuna() {
        return Fecha_Vacuna;
    }

    public void setFecha_Vacuna(String Fecha_Vacuna) {
        this.Fecha_Vacuna = Fecha_Vacuna;
    }

    public int getCodigo_Vacuna() {
        return Codigo_Vacuna;
    }

    public void setCodigo_Vacuna(int Codigo_Vacuna) {
        this.Codigo_Vacuna = Codigo_Vacuna;
    }

    public String getNombre_Vacuna() {
        return Nombre_Vacuna;
    }

    public void setNombre_Vacuna(String Nombre_Vacuna) {
        this.Nombre_Vacuna = Nombre_Vacuna;
    }
    
    
}
