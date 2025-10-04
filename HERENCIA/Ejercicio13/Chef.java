/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jercicio13;

/**
 *
 * @author Doghy
 */
public class Chef extends Empleado {

    private int horaExtra;
    private String tipo;
    private float sueldoHora;

    public Chef(String nombre, float sueldoMes, int horaExtra, String tipo, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horaExtra = horaExtra;
        this.tipo = tipo;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public float sueldoTotal() {
        return sueldoMes + horaExtra * sueldoHora;
    }

    @Override
    public String toString() {
        return String.format("%s - Chef (%s) - sueldoMes: %.2f - horasExtra: %d - sueldoHora: %.2f",
                nombre, tipo, sueldoMes, horaExtra, sueldoHora);
    }
}
