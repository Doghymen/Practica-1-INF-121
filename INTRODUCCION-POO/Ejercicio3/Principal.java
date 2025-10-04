/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Doghy
 */
public class Principal {
    public static void main (String[] args){
        
        Producto prod = new Producto("camisas", 22.50, 100);
        
        
        prod.Vender(40);
        
        prod.Reabastecer(100);
        prod.Mostrar();
    }
}
