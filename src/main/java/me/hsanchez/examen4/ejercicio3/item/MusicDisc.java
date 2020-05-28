/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio3.item;

import me.hsanchez.examen4.ejercicio3.exception.BookItemException;
import me.hsanchez.examen4.ejercicio3.exception.LendItemException;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class MusicDisc implements LibraryItem {

    @Override
    public void lend() throws LendItemException {
        System.out.println("Se ha prestado el disco");
    }

    @Override
    public void book() throws BookItemException {
        System.out.println("Se ha reservado el disco");
    }
    
}
