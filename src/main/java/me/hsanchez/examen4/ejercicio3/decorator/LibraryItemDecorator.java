/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio3.decorator;

import me.hsanchez.examen4.ejercicio3.item.LibraryItem;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public abstract class LibraryItemDecorator implements LibraryItem {
    protected LibraryItem item;

    protected LibraryItem getItem() {
        return item;
    }
    
    protected void setItem(LibraryItem item) {
        this.item = item;
    }
    
}
