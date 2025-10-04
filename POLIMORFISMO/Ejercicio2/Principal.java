/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        
        Videojuego v1 = new Videojuego("Warcraft", "Steam", 100);
        Videojuego v2 = new Videojuego("Fifa", "PC", 2);
        
        
        
        v1.agregarJugadores();
        v1.agregarJugadores(2);
        
        v2.agregarJugadores();
        v2.agregarJugadores(4);
        
        v1.mostrar();
        v2.mostrar();
    }
}
