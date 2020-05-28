/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio5.machine;

import me.hsanchez.examen4.ejercicio5.state.MachineState;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class ExpendingMachine {
    private MachineState state;

    public void setState(MachineState state) {
        this.state = state;
    }

    public MachineState getState() {
        return state;
    }
    
    public void handle(Object input) {
        this.state.handle(input);
    }
    
    public void checkState() {
        System.out.println("Estado actual: " + state.toString());
    }
}
