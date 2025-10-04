/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Doghy
 */
public class Vehiculo {

    private String conductor;
    private String placa;
    private int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getId() {
        return id;
    }

    public void cambiarConductor(String nuevoConductor) {
        setConductor(nuevoConductor);
    }

    public void mostrarPlacaYConductor() {
        System.out.println("ID Vehiculo: " + id + " | Placa: " + placa + " | Conductor: " + conductor);
    }
}
