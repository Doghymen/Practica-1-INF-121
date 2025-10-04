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

    public static void main(String[] args) {
        // a)
        System.out.println("################ A) ################");
        System.out.println("################ A) ################");
        Matriz identidad = new Matriz();
        identidad.mostrar();

        // b)
        System.out.println("################ B) ################");
        System.out.println("################ B) ################");

        float[][] aux1 = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                aux1[i][j] = i + j;
            }
        }
        Matriz m1 = new Matriz(aux1);
        m1.mostrar();

        System.out.println("################ C) Suma ################");
        System.out.println("################ C) Suma ################");
        float[][] aux2 = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                aux2[i][j] = i * j;
            }
        }

        Matriz m2 = new Matriz(aux2);
        Matriz suma = m1.sumar(m2);
        suma.mostrar();

        System.out.println("################ C) Resta ################");
        System.out.println("################ C) Resta ################");
        Matriz resta = m1.restar(m2);
        resta.mostrar();
        
        System.out.println("################ D) ################");
        System.out.println("################ D) ################");
        m2.igual(m1);
        m2.mostrar(); 
    }
}
