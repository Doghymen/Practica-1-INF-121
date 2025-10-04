/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jercicio13;

import java.util.Scanner;

/**
 *
 * @author Doghy
 */
public class Principal{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Instanciar 1 Chef, 2 Meseros y 2 Administrativos
        Empleado[] empleados = new Empleado[5];
        empleados[0] = new Chef("Remy", 2000.0f, 10, "Chef Ejecutivo", 25.0f);
        empleados[1] = new Mesero("Linguini", 800.0f, 150.50, 5, 5.0f);
        empleados[2] = new Mesero("Colette", 800.0f, 200.75, 2, 6.0f);
        empleados[3] = new Administrativo("August", 1200.0f, "Contabilidad");
        empleados[4] = new Administrativo("Emile", 1200.0f, "Recepcion");

        System.out.println("Empleados");
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        // b) Pedir X por consola
        System.out.print("Buscar empleados con sueldoMes = X: ");
        float X = sc.nextFloat();

        System.out.println("Empleados con sueldoMes == " + X + ":");
        boolean encontrado = false;
        for (Empleado e : empleados) {
            if (e.getSueldoMes() == X) {
                System.out.println(e);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Ningun empleado tiene sueldoMes igual a " + X);
        }

        // c) Mostrar sueldoTotal de cada empleado
        System.out.println("SueldoTotal de cada empleado:");
        for (Empleado e : empleados) {
            System.out.printf("%s (%s) = sueldoMes: %.2f | SueldoTotal: %.2f%n",
                    e.getNombre(), e.getClass().getSimpleName(),
                    e.getSueldoMes(), e.sueldoTotal());
        }

        sc.close();
    }

}
