/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hsanchez.examen4.ejercicio4.employee;

/**
 *
 * @author hsanchez <hsanchez.dev@gmail.com>
 */
public class Employee implements EmployeeView {
    private String name;
    private String job;
    private double salary;

    public Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String viewInfo() {
        return "Empleado: " + this.getName();
    }
}
