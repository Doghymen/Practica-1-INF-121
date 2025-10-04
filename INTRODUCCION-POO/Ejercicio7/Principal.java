/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Doghy
 */
public class Principal {
    public static void main (String[] args){
        
        Mascota perro = new Mascota("Koda", "Perro", 40);
        Mascota gato = new Mascota("Tomy", "Gato", 60);
        
        
        perro.mostrarEstado();
        gato.mostrarEstado();
        
        System.out.println("ALIMENTANDO A LAS MASCOTAS");
        perro.alimentar();
        gato.alimentar();
        
        System.out.println("LAS MASCOTAS JUGARON");
        perro.jugar();
        gato.jugar();
    }
}
