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
        // a)
        Estudiante est1 = new Estudiante("Luis", "Ulo", "Poma", 20, "RU001", "MAT-100");
        Estudiante est2 = new Estudiante("Maria", "Gonzales", "Lopez", 22, "RU002", "MAT-101");
        Docente docente = new Docente("Carlos", "Perez", "Soto", 40, 3500.50, "RP-12345");

        // b)
        System.out.println("=== Mostrar inicial ===");
        est1.mostrar();
        est2.mostrar();
        docente.mostrar();

        // c)
        Estudiante[] estudiantes = new Estudiante[]{est1, est2};
        double promedio = Estudiante.promedio(estudiantes);
        System.out.printf("Promedio de edad de los estudiantes es de", promedio);

        // d) Modificar edad de un estudiante
        System.out.println("Modificar edad del primer estudiante");
        est1.modificarEdad(40); // ahora est1 tiene 40
        est1.mostrar();

        
        double nuevoPromedio = Estudiante.promedio(estudiantes);
        System.out.printf("\nNuevo promedio de edad: %.2f\n", nuevoPromedio);

        // e)
        System.out.println("\n--- Verificar igualdad de edades con el docente ---");
        boolean algunoIgual = false;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getEdad() == docente.getEdad()) {
                System.out.println("El estudiante " + estudiantes[i].getNombre()
                        + " tiene la misma edad que el docente (" + docente.getEdad() + ").");
                algunoIgual = true;
            }
        }
        if (!algunoIgual) {
            System.out.println("Ningún estudiante tiene la misma edad que el docente.");
        }
    }
}
