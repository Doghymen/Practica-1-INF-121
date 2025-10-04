/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public interface Ciclista {

    String getTipoBicicleta();

    void setTipoBicicleta(String tipo);

    default void pedalear() {
        System.out.println("Pedaleando en bicicleta tipo " + getTipoBicicleta());
    }

}
