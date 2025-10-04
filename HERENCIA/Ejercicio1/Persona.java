/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Doghy
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String ci;

    public Persona(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String method(String tipo) {
        return "Persona: " + tipo;
    }

    public void mostrarInfo() {
        System.out.println("=============== Persona ===============");
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", CI: " + ci);
    }
}
