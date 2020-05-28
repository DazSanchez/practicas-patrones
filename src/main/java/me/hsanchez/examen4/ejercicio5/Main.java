/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio5;

import me.hsanchez.examen4.ejercicio5.machine.ExpendingMachine;
import me.hsanchez.examen4.ejercicio5.product.Product;
import me.hsanchez.examen4.ejercicio5.product.ProductExchange;
import me.hsanchez.examen4.ejercicio5.state.MoneyReception;
import me.hsanchez.examen4.ejercicio5.state.MoneyReturn;
import me.hsanchez.examen4.ejercicio5.state.ProductSelection;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        ExpendingMachine machine = new ExpendingMachine();
        machine.setState(new MoneyReception());
        
        Double amount = 20.5d;
        
        machine.handle(amount);
        machine.checkState();
        
        machine.setState(new ProductSelection());
        Product product = new Product(1, 15.5);
        machine.handle(product);
        machine.checkState();
        
        ProductExchange exchange = new ProductExchange(amount, product);
        machine.setState(new MoneyReturn());
        machine.handle(exchange);
        machine.checkState();
    }
}
