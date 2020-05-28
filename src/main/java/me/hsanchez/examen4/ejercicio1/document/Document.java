/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio1.document;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Document {

    private LocalDate date;
    private String content;
    private String author;
    private final DateTimeFormatter formatter;

    public Document(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Autor: %s | Creado el: %s%n%s", this.author, this.date.format(formatter), this.content);
    }
}
