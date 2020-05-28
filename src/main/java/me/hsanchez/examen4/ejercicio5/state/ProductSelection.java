/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio5.state;

import me.hsanchez.examen4.ejercicio5.product.Product;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class ProductSelection implements MachineState {

    private Product product;
    
    @Override
    public void handle(Object input) {
        this.product = (Product) input;
    }

    @Override
    public String toString() {
        return "ProductSelection{" + "product=" + product + '}';
    }
}
