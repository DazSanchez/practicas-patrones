/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio6.state;

import java.util.Observable;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class ConfirmationState extends Observable {

    private boolean confirmed;

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
        setChanged();
        notifyObservers(this.confirmed);
    }

    public boolean isConfirmed() {
        return confirmed;
    }

}
