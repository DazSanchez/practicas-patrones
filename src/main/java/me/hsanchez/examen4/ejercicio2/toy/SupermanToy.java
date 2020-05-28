/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio2.toy;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class SupermanToy extends Toy {

    @Override
    public void turnOn() {
        System.out.println("No se de qué agujero saliste, pero te voy a enviar de vuelta a él");
    }

    @Override
    public void turnOff() {
        System.out.println("Hasta la próxima amigo");
    }

}
