/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio6;

import me.hsanchez.examen4.ejercicio6.state.ConfirmationState;
import me.hsanchez.examen4.ejercicio6.state.ProjectState;
import me.hsanchez.examen4.ejercicio6.ui.SecondView;
import me.hsanchez.examen4.ejercicio6.ui.MainView;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        ProjectState projectState = new ProjectState();
        ConfirmationState confirmationState = new ConfirmationState();

        MainView mainView = new MainView(projectState);
        mainView.setVisible(true);
        confirmationState.addObserver(mainView);

        SecondView secondView = new SecondView(confirmationState);
        secondView.setVisible(true);
        projectState.addObserver(secondView);

    }
}
