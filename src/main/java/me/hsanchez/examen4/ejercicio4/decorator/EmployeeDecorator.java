/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio4.decorator;

import me.hsanchez.examen4.ejercicio4.employee.Employee;
import me.hsanchez.examen4.ejercicio4.employee.EmployeeView;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public abstract class EmployeeDecorator implements EmployeeView {

    private final Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    protected Employee getEmployee() {
        return employee;
    }

}
