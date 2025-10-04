/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public interface Nadador {
    
    String getEstiloNatacion();

    void setEstiloNatacion(String estilo);

    default void nadar() {
        System.out.println("Nadando estilo " + getEstiloNatacion());
    }

}
