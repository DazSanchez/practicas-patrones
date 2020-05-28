/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio4.decorator;

import me.hsanchez.examen4.ejercicio4.employee.Employee;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class ManagerEmployeeDecorator extends AssistantManagerEmployee {

    public ManagerEmployeeDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public String viewInfo() {
        return super.viewInfo() + ", con salario de $" + this.getEmployee().getSalary();
    }
    
}
