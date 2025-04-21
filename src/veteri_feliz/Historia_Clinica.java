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
public class Historia_Clinica extends Mascota{
    int Id_Visita;
    String Fecha_Visita;
    String Motivo;

    public Historia_Clinica(int Id_Visita, String Fecha_Visita, String Motivo, int ID, String Nombre_Mascota, String Especie, String Raza, String Color, String Fecha_N, int Peso) {
        super(ID, Nombre_Mascota, Especie, Raza, Color, Fecha_N, Peso);
        this.Id_Visita = Id_Visita;
        this.Fecha_Visita = Fecha_Visita;
        this.Motivo = Motivo;
    }

    public Historia_Clinica() {
    }

    public int getId_Visita() {
        return Id_Visita;
    }

    public void setId_Visita(int Id_Visita) {
        this.Id_Visita = Id_Visita;
    }

    public String getFecha_Visita() {
        return Fecha_Visita;
    }

    public void setFecha_Visita(String Fecha_Visita) {
        this.Fecha_Visita = Fecha_Visita;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre_Mascota() {
        return Nombre_Mascota;
    }

    public void setNombre_Mascota(String Nombre_Mascota) {
        this.Nombre_Mascota = Nombre_Mascota;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getFecha_N() {
        return Fecha_N;
    }

    public void setFecha_N(String Fecha_N) {
        this.Fecha_N = Fecha_N;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }
    
    
}
