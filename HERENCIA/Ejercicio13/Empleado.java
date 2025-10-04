/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jercicio13;

/**
 *
 * @author Doghy
 */
public class Empleado {

    protected String nombre;
    protected float sueldoMes;

    public Empleado(String nombre, float sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldoMes() {
        return sueldoMes;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - sueldoMes: %.2f",
                nombre, this.getClass().getSimpleName(), sueldoMes);
    }
}
