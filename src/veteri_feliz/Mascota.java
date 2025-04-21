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
public class Mascota{
    int ID;
    String Nombre_Mascota;
    String Especie;
    String Raza;
    String Color;
    String Fecha_N;
    int Peso;

    public Mascota(int ID, String Nombre_Mascota, String Especie, String Raza, String Color, String Fecha_N, int Peso) {
        this.ID = ID;
        this.Nombre_Mascota = Nombre_Mascota;
        this.Especie = Especie;
        this.Raza = Raza;
        this.Color = Color;
        this.Fecha_N = Fecha_N;
        this.Peso = Peso;
    }

    public Mascota() {
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
