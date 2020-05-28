/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio1.factory;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class LocalDateFormaterFactory {
    public static DateTimeFormatter createUSFormatter() {
        return DateTimeFormatter.ofPattern("MM/dd/YYYY");
    }
    
    public static DateTimeFormatter createEUFormatter() {
        return DateTimeFormatter.ofPattern("dd/MM/YYYY");
    }
}
