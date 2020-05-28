/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio2;

import me.hsanchez.examen4.ejercicio2.toy.Toy;
import me.hsanchez.examen4.ejercicio2.factory.ToyFactory;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Creando BarbieGirl");
        Toy barbieGirl = ToyFactory.create(ToyFactory.BARBIE_TOY);
        barbieGirl.turnOn();
        barbieGirl.turnOff();
        
        System.out.println("Creando Superman");
        Toy superman = ToyFactory.create(ToyFactory.SUPERMAN_TOY);
        superman.turnOn();
        superman.turnOff();
        
        System.out.println("Creando pokemon");
        Toy pokemon = ToyFactory.create(ToyFactory.POKEMON_TOY);
        pokemon.turnOn();
        pokemon.turnOff();
    }
}
