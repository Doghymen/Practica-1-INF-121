/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Doghy
 */
public class Principal {
    public static void main(String[] args){
        
        Producto cafe = new Producto("Cafe caliente", 14.50);
        
        
        Pedido pedido1 = new Pedido(1, "Entregado");
        
        
        
        
        // Mostrar objetos
        System.out.println("\n--- Detalle Pedido Realizado ---");
        System.out.println(cafe);
        System.out.println(pedido1);

        
        
        cafe.Destructor();
        pedido1.Destructor();
    }
}