/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio4;

import me.hsanchez.examen4.ejercicio4.decorator.AssistantManagerEmployee;
import me.hsanchez.examen4.ejercicio4.decorator.ManagerEmployeeDecorator;
import me.hsanchez.examen4.ejercicio4.employee.Employee;
import me.hsanchez.examen4.ejercicio4.employee.EmployeeView;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        EmployeeView employee = new Employee("Hugo Sánchez", "Contador", 15000);
        System.out.println(employee.viewInfo());

        EmployeeView asAssistant = new AssistantManagerEmployee((Employee) employee);
        System.out.println(asAssistant.viewInfo());

        EmployeeView asManager = new ManagerEmployeeDecorator((Employee) employee);
        System.out.println(asManager.viewInfo());
    }
}
