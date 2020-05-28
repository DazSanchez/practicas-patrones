/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio6.state;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class ProjectInfo {
    private double currentBudget;
    private String projectType;

    public double getCurrentBudget() {
        return currentBudget;
    }

    public void setCurrentBudget(double currentBudget) {
        this.currentBudget = currentBudget;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }
    
    
}
