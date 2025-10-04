/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Doghy
 */
public class Cliente extends Persona{

    private String nroCompra;
    private String idCliente;

    public Cliente(String nombre, String apellido, String ci, String nroCompra, String idCliente) {
        super(nombre, apellido, ci);
        this.nroCompra = nroCompra;
        this.idCliente = idCliente;
    }

    public String getNroCompra() {
        return nroCompra;
    }

    public void setNroCompra(String nroCompra) {
        this.nroCompra = nroCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String method(String tipo) {
        return "Cliente: " + tipo;
    }

    public void mostrar() {
        System.out.println("======== Cliente =======");
        System.out.println("Nombre: " + getNombre()
                + ", Apellido: " + getApellido()
                + ", CI: " + getCi()
                + ", nroCompra: " + nroCompra
                + ", idCliente: " + idCliente);
    }
}
