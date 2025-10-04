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
    public static void main (String[] args){
        
        Bus primerBus = new Bus(1.50, 40);
        
        
        
        primerBus.SubePasajeros(5);
        primerBus.CobrarPasaje();
        primerBus.MostrarAsientoDisponible();
    }
}
