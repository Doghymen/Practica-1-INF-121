/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Doghy
 */
public class Presidente extends Politico{

    private String nombre;
    private String apellido;
    private Partido partido;

    public Presidente(String nombre, String apellido, String profesion, int aniosExp, Partido partido) {
        super(profesion, aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;
    }

    public Presidente(String nombre, String apellido, String profesion, int aniosExp,
            String nombrePartido, String rolPartido) {
        super(profesion, aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = new Partido(nombrePartido, rolPartido);
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

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public String getProfesion() {
        return super.getProfesion();
    }

    public int getAniosExp() {
        return super.getAniosExp();
    }

    public void mostrar() {
        System.out.println("Presidente: " + nombre + " " + apellido);
        System.out.println("  Profesion: " + getProfesion() + " | Anios Exp: " + getAniosExp());
        if (partido != null) {
            System.out.println("  Partido: " + partido.getNombreP() + " | Rol: " + partido.getRol());
        } else {
            System.out.println("  Partido: (no asignado)");
        }
    }
}
