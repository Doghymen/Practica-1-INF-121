/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Doghy
 */
public class Bus {
    private int pasajeros;
    private double pasaje;
    private int asientos;
    
    public Bus(double pasaje, int asientos){
        this.pasajeros = 0;
        this.pasaje = pasaje;
        this.asientos = asientos;
    }
    
    // a) Al bus desean subir X cantidad de pasajeros, actualizar los datos del bus
    public void SubePasajeros(int x){
        if(x <= this.asientos){
            this.pasajeros += x;
            System.out.println("La cantidad de pasajeros que subieron es de: " + this.pasajeros);
        }
    }
    
    // b) Crea un método para cobrar pasaje a los pasajeros costo del pasaje 1.50 Bs
    public double CobrarPasaje(){
        double total = this.pasajeros * this.pasaje;
        System.out.println("El total de pasaje cobrado es Bs:" + total);
        return total;
    }
    
    // c) Muestra cuántos asientos quedan disponibles
    public int MostrarAsientoDisponible(){
        int disponibles = this.asientos - this.pasajeros;
        System.out.println("La cantidad de asientos disponibles es de: " + disponibles + " asientos de: " + this.asientos);
        return disponibles;
    }
}
