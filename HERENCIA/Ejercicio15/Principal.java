/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CREAR TRIATLETA ===");

        System.out.print("Ingrese estilo de natacion: ");
        String estilo = sc.nextLine();

        System.out.print("Ingrese tipo de bicicleta: ");
        String tipoBici = sc.nextLine();

        System.out.print("Ingrese distancia preferida (km): ");
        double distancia = sc.nextDouble();

        // b)
        Triatleta tri = new Triatleta(estilo, tipoBici, distancia);

        // Mostrar información del triatleta
        System.out.println("Triatleta creado:");
        System.out.println(tri);

        // c)
        System.out.println("Acciones del triatleta:");
        tri.nadar();
        tri.pedalear();
        tri.correr();

        sc.close();
    }
}
