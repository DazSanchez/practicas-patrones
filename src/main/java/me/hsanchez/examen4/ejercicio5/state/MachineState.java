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
public interface MachineState {
    void handle(Object input);
    @Override
    String toString();
}
