/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio5.product;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Product {

    private final int id;
    private final double price;

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + '}';
    }

}
