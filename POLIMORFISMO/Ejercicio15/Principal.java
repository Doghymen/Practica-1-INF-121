/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        // a)
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 10);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 10);

        // a)
        Ordenador c1 = new Ordenador("A001", 1, 4, "Intel i3", true);
        Ordenador c2 = new Ordenador("A002", 2, 16, "Intel i7", true);
        Ordenador c3 = new Ordenador("A003", 3, 8, "Ryzen 5", false);
        Ordenador c4 = new Ordenador("A004", 4, 12, "Ryzen 7", true);
        Ordenador c5 = new Ordenador("A005", 5, 32, "Intel i9", false);
        Ordenador c6 = new Ordenador("A006", 6, 6, "Intel i5", true);

        // Agregar a laboratorios
        lasin1.agregarComputadora(c1);
        lasin1.agregarComputadora(c2);
        lasin1.agregarComputadora(c3);
        lasin2.agregarComputadora(c4);
        lasin2.agregarComputadora(c5);
        lasin2.agregarComputadora(c6);

        // b)
        lasin1.informacion(true);
        lasin1.informacion(false);
        lasin1.informacion();
        lasin2.informacion(8);

        // c) 
        System.out.println("\nAntes del traslado");
        lasin1.informacion();
        lasin2.informacion();

        // Traslado
        Ordenador traslado1 = lasin1.quitarComputadora(0);
        Ordenador traslado2 = lasin1.quitarComputadora(0);
        lasin2.agregarComputadora(traslado1);
        lasin2.agregarComputadora(traslado2);

        System.out.println("\nDespues del traslado");
        lasin1.informacion();
        lasin2.informacion();
    }
}
