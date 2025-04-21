/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veteri_feliz;

/**
 *
 * @author juanj
 */
public class Veterinario {
    int Id_Veterinario;
    int Cedula_Veterinario;
    String Nombre_Veterinario;

    public Veterinario(int Id_Veterinario, int Cedula_Veterinario, String Nombre_Veterinario) {
        this.Id_Veterinario = Id_Veterinario;
        this.Cedula_Veterinario = Cedula_Veterinario;
        this.Nombre_Veterinario = Nombre_Veterinario;
    }

    public Veterinario() {
    }

    public int getId_Veterinario() {
        return Id_Veterinario;
    }

    public void setId_Veterinario(int Id_Veterinario) {
        this.Id_Veterinario = Id_Veterinario;
    }

    public int getCedula_Veterinario() {
        return Cedula_Veterinario;
    }

    public void setCedula_Veterinario(int Cedula_Veterinario) {
        this.Cedula_Veterinario = Cedula_Veterinario;
    }

    public String getNombre_Veterinario() {
        return Nombre_Veterinario;
    }

    public void setNombre_Veterinario(String Nombre_Veterinario) {
        this.Nombre_Veterinario = Nombre_Veterinario;
    }
    
    
}
