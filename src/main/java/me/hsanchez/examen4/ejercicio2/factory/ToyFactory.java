/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio2.factory;

import me.hsanchez.examen4.ejercicio2.toy.BarbieGirlToy;
import me.hsanchez.examen4.ejercicio2.toy.PokemonToy;
import me.hsanchez.examen4.ejercicio2.toy.SupermanToy;
import me.hsanchez.examen4.ejercicio2.toy.Toy;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class ToyFactory {
    public static final String BARBIE_TOY = "BARBIE_TOY";
    public static final String SUPERMAN_TOY = "SUPERMAN_TOY";
    public static final String POKEMON_TOY = "POKEMON_TOY";
    
    public static Toy create(String type) {
        switch(type) {
            case BARBIE_TOY:
                return new BarbieGirlToy();
            case SUPERMAN_TOY:
                return new SupermanToy();
            case POKEMON_TOY:
                return new PokemonToy();
            default:
                return null;
        }
    }
}
