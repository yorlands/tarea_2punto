/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_2punto;

/**
 *
 * @author Administrator
 */
public class Tarea_2punto {

    public static void main(String[] args) {
        Car miCoche = new Car();
        miCoche.addDoor();
         miCoche.addDoor();
        System.out.println("El coche tiene " + miCoche.getDoorCount() + " puertas.");
    }
}