/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jercicio13;

/**
 *
 * @author Doghy
 */
public class Mesero extends Empleado {

    private double propina;
    private int horaExtra;
    private float sueldoHora;

    public Mesero(String nombre, float sueldoMes, double propina, int horaExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.propina = propina;
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public float sueldoTotal() {
        return (float) (sueldoMes + horaExtra * sueldoHora + propina);
    }

    @Override
    public String toString() {
        return String.format("%s - Mesero - sueldoMes: %.2f - propina: %.2f - horasExtra: %d - sueldoHora: %.2f",
                nombre, sueldoMes, propina, horaExtra, sueldoHora);
    }
}
