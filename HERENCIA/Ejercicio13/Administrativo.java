/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jercicio13;

/**
 *
 * @author Doghy
 */
public class Administrativo extends Empleado{

    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return String.format("%s - Administrativo - cargo: %s - sueldoMes: %.2f",
                nombre, cargo, sueldoMes);
    }
}
