/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio3;

import me.hsanchez.examen4.ejercicio3.decorator.LockItemDecorator;
import me.hsanchez.examen4.ejercicio3.exception.BookItemException;
import me.hsanchez.examen4.ejercicio3.exception.LendItemException;
import me.hsanchez.examen4.ejercicio3.item.Book;
import me.hsanchez.examen4.ejercicio3.item.LibraryItem;
import me.hsanchez.examen4.ejercicio3.item.MusicDisc;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        LibraryItem book1 = new Book();
        LibraryItem disc1 = new MusicDisc();
        
        try {
            book1.lend();
            book1.book();
            
            disc1.lend();
            disc1.book();
        } catch (LendItemException | BookItemException ex) {
            System.err.println(ex.getMessage());
        }
        
        LibraryItem lockedBook = new LockItemDecorator(book1);
        
        try {
            lockedBook.lend();
        } catch (LendItemException ex) {
            System.err.println(ex.getMessage());
        }
        
        try {
            lockedBook.book();
        } catch (BookItemException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
