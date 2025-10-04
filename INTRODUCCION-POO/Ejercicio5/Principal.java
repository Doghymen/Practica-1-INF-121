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
    public static void main(String[] args){
        
        Persona p1 = new Persona("Luis", "Ulo", "Poma", 24, 8333828);
        Persona p2 = new Persona("Damariz", "Cusi", "Uscamayta", 21, 1234567);
        
        System.out.println("======= DATOS PRIMERA PERSONA =======");
        p1.mostrarDatos();
        System.out.println("======= DATOS SEGUNDA PERSONA =======");
        p2.mostrarDatos();
        
        
        System.out.println("======= Consulta Mayo de edad =======");
        System.out.println(p1.getPaterno() + " es mayor de edad?: " + p1.mayorEdad());
        
        System.out.println("======= MODIFICAR EDAD =======");
        p1.modificarEdad(18);
        
        System.out.println("======= COMPARANDO APELLIDOS PATERNOS =======");
        if (p1.getPaterno().equals(p2.getPaterno())) {
            System.out.println("Tienen el mismo apellido paterno");
        } else{
            System.out.println("No tienen el mismo apellido paterno");
        }
    }
}
