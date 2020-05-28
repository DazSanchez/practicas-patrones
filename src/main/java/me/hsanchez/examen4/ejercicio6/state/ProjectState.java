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
public class ProjectState extends Observable {
    
    private ProjectInfo projectInfo;

    public ProjectState() {
        this.projectInfo = new ProjectInfo();
    }
    
    public void setProjectInfo(double budget, String projectType) {
        this.projectInfo.setCurrentBudget(budget);
        this.projectInfo.setProjectType(projectType);
        setChanged();
        notifyObservers(this.projectInfo);
    }

}
