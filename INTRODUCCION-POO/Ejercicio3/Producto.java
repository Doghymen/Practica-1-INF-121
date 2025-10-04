/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Doghy
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    
    // a) Define la clase y los atributos
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    // b) Agrega un método vender (cantidad: int) que reste del stock
    public void Vender(int cantidad){
        if (cantidad <= this.stock) {
            int totalActual = this.stock;
            this.stock -= cantidad;
            System.out.println("Se vendio " + cantidad + this.nombre + " de " + totalActual);
        } else{
            System.out.println("No se dispone de la cantidad requerida en nuestro stock");
        }
    }
    
    // c) Agrega un método reabastecer (cantidad: int) que sume al stock
    public void Reabastecer(int cantidad){
        this.stock += cantidad;
        System.out.println("Se agrego " + cantidad + this.nombre);
    }
    
    public void Mostrar(){
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock disponible actual:" + this.stock);
    }
}
