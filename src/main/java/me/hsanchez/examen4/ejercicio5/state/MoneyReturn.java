/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio5.state;

import me.hsanchez.examen4.ejercicio5.product.ProductExchange;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class MoneyReturn implements MachineState {

    private ProductExchange exchange;

    @Override
    public void handle(Object input) {
        this.exchange = (ProductExchange) input;
    }

    @Override
    public String toString() {
        return "MoneyReturn{" + "exchange=" + exchange + '}';
    }

}
