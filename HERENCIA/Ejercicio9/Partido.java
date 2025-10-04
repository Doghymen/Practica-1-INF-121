/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Doghy
 */
public class Partido {

    private String nombreP;
    private String rol;

    public Partido(String nombreP, String rol) {
        this.nombreP = nombreP;
        this.rol = rol;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void mostrarPartido() {
        System.out.println("Partido: " + nombreP + " | Rol: " + rol);
    }
}
