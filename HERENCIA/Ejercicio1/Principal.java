/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Luis", "Ulo", "1234567", "NRO-001", "ID-001");
        Jefe j1 = new Jefe("Ana", "Lopez", "9876543", "Sucursal Central", "Gerente");

        c1.mostrar();
        j1.mostrar();

        System.out.println(c1.method("Test Cliente"));
        System.out.println(j1.method("Test Jefe"));
    }
}
