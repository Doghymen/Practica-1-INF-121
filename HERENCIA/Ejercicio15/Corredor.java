/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public interface Corredor {

    double getDistanciaPreferida();

    void setDistanciaPreferida(double distancia);

    default void correr() {
        System.out.println("Corriendo una distancia de " + getDistanciaPreferida() + " km");

    }
}
