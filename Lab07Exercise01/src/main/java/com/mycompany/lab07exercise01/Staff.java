/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab07exercise01;

public class Staff extends Employee {
    String workingHours;

    public Staff(String workingHours, String employeeName, String employeeDesignation, String employeeDepartment, String employeeEmail, int employeeNumber, int employeeSalary) {
        super(employeeName, employeeDesignation, employeeDepartment, employeeEmail, employeeNumber, employeeSalary);
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
return super.toString() +"Working Hours: "+this.workingHours;
    }}
    
