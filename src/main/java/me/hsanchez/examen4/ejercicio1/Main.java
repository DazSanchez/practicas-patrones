/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio1;

import me.hsanchez.examen4.ejercicio1.document.Document;
import me.hsanchez.examen4.ejercicio1.factory.DocumentFactory;
import java.time.LocalDate;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        
        String documentContent = "Contenido del documento";
        LocalDate documentCreationDate = LocalDate.now();
        String documentAuthor = "Hugo Sánchez Velázquez";
        
        Document usDocument = DocumentFactory.createWithUSDateFormat(),
                 euDocument = DocumentFactory.createWithEUDateFormat();
        
        usDocument.setAuthor(documentAuthor);
        usDocument.setContent(documentContent);
        usDocument.setDate(documentCreationDate);
        
        euDocument.setAuthor(documentAuthor);
        euDocument.setContent(documentContent);
        euDocument.setDate(documentCreationDate);
        
        System.out.println(usDocument);
        System.out.println(euDocument);
    }
}
