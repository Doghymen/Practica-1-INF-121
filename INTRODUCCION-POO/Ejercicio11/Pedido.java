/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Doghy
 */
public class Pedido {

    private int numPedido;
    private String estado;

    public Pedido(int numPedido, String estado) {
        this.numPedido = numPedido;
        this.estado = estado;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void Destructor() {
        this.numPedido = 0;
        this.estado = null;
    }

    @Override
    public String toString() {
        return "Pedido: codigo= " + numPedido + ", estado= " + estado;
    }
}
