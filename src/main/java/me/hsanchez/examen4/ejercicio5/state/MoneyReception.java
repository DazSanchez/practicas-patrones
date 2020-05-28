/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio5.state;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class MoneyReception implements MachineState {

    private Double amount;

    @Override
    public void handle(Object input) {
        this.amount = (Double) input;
    }

    @Override
    public String toString() {
        return "MoneyReception{" + "amount=" + amount + '}';
    }

}
