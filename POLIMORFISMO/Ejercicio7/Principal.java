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

    public static void main(String[] args) {
        // Objeto con constructor por defecto
        Parada p1 = new Parada();
        p1.adicionar("Admin1");
        p1.adicionar("Chevrolet Onix", "Ana Gomez", "DEF-456");
        p1.mostrar();

        // Objeto con constructor pidiendo datos
        Parada p2 = new Parada("Parada Ceja");
        p2.adicionar("Maria");
        p2.adicionar("Hyundai", "Sofia Diaz", "JKL-012");
        p2.mostrar();
    }
}
