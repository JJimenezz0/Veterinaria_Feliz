/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veteri_feliz;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author juanj
 */
public class Cita{
    int Codigo_Cita;
    String Fecha_Cita;
    String Hora_Cita;
    String Veterinario;
    int Codigo_Mascota;

    public Cita(int Codigo_Cita, int Codigo_Mascota, String Fecha_Cita, String Hora_Cita, String Veterinario) {
        this.Codigo_Cita = Codigo_Cita;
        this.Fecha_Cita = Fecha_Cita;
        this.Hora_Cita = Hora_Cita;
        this.Veterinario = Veterinario;
        this.Codigo_Mascota = Codigo_Mascota;
    }

    public Cita() {
    }
    
    public int getCodigo_Cita() {
        return Codigo_Cita;
    }

    public void setCodigo_Cita(int Codigo_Cita) {
        this.Codigo_Cita = Codigo_Cita;
    }

    public String getFecha_Cita() {
        return Fecha_Cita;
    }

    public void setFecha_Cita(String Fecha_Cita) {
        this.Fecha_Cita = Fecha_Cita;
    }

    public String getHora_Cita() {
        return Hora_Cita;
    }

    public void setHora_Cita(String Hora_Cita) {
        this.Hora_Cita = Hora_Cita;
    }

    public String getVeterinario() {
        return Veterinario;
    }

    public void setVeterinario(String Veterinario) {
        this.Veterinario = Veterinario;
    }

    public int getCodigo_Mascota() {
        return Codigo_Mascota;
    }

    public void setCodigo_Mascota(int Codigo_Mascota) {
        this.Codigo_Mascota = Codigo_Mascota;
    }
    
    
}
