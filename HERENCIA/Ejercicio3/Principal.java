/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        Leon leon = new Leon("Simba", 5);
        Pinguino pinguino = new Pinguino("kowalski", 3);
        Canguro canguro = new Canguro("Roger", 7);

        leon.desplazarse();
        pinguino.desplazarse();
        canguro.desplazarse();
    }
}
