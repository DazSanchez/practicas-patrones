/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio3.decorator;

import me.hsanchez.examen4.ejercicio3.exception.BookItemException;
import me.hsanchez.examen4.ejercicio3.exception.LendItemException;
import me.hsanchez.examen4.ejercicio3.item.LibraryItem;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class LockItemDecorator extends LibraryItemDecorator {

    public LockItemDecorator(LibraryItem item) {
        super.setItem(item);
    }

    @Override
    public void lend() throws LendItemException {
        throw new LendItemException("Este artículo no se puede prestar");
    }

    @Override
    public void book() throws BookItemException {
        throw new BookItemException("Este artículo no se puede reservar");
    }
    
}
