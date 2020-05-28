/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio1.factory;

import me.hsanchez.examen4.ejercicio1.document.Document;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class DocumentFactory {
    public static Document createWithUSDateFormat() {
        return new Document(LocalDateFormaterFactory.createUSFormatter());
    }
    
    public static Document createWithEUDateFormat() {
        return new Document(LocalDateFormaterFactory.createEUFormatter());
    }
}
