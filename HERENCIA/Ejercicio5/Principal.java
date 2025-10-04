/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        // a)
        Vehiculo bus = new Bus("Carlos Perez", "BUS-123", 1, 50, "Sindicato A");
        Vehiculo auto = new Auto("Maria Gomez", "AUTO-456", 2, 120, true);
        Vehiculo moto = new Moto("Jorge Ruiz", "MOTO-789", 3, 250, true);

        // b)
        System.out.println("Informacion de los vehiculos:");
        bus.mostrarPlacaYConductor();
        auto.mostrarPlacaYConductor();
        moto.mostrarPlacaYConductor();

        System.out.println(" Cambiando de conductor ");
        // c)
        auto.cambiarConductor("Laura Fernandez");
        auto.mostrarPlacaYConductor();

    }
}
