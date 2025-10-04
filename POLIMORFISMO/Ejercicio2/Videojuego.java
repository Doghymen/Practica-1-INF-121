/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Doghy
 */
public class Videojuego {

    private String nombre;
    private String plataforma;
    private int jugadores;
    private int cantidadjugadores;

    public Videojuego(String nombre, String plataforma, int jugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.jugadores = jugadores;
    }
    
    public Videojuego(){
        this.nombre = "Luis";
        this.plataforma = "Correo";
        this.jugadores = 2;
    }
    
    public void agregarJugadores(){
        cantidadjugadores = cantidadjugadores + 1;
    }
    
    public void agregarJugadores(int cantidad){
        cantidadjugadores += cantidad;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadjugadores);
    }
}
