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
public interface LibraryItem {
    void lend() throws LendItemException;
    void book() throws BookItemException;
}
