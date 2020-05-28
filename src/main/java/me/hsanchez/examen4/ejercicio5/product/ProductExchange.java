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
public class ProductExchange {

    private Double money;
    private Product product;

    public ProductExchange(Double money, Product product) {
        this.money = money;
        this.product = product;
    }

    public double getExchange() {
        return this.money - this.product.getPrice();
    }

    @Override
    public String toString() {
        return "ProductExchange{" + "money=" + money + ", product=" + product + ", remaining=" + this.getExchange() + '}';
    }

}
