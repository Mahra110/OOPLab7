/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab07exercise01;
public class Employee {
    String employeeName,employeeDesignation,employeeDepartment,employeeEmail;
    int employeeNumber,employeeSalary;

    public Employee(String employeeName, String employeeDesignation, String employeeDepartment, String employeeEmail, int employeeNumber, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeDepartment = employeeDepartment;
        this.employeeEmail = employeeEmail;
        this.employeeNumber = employeeNumber;
        this.employeeSalary = employeeSalary;
    }
    public String toString(){
        return "\nName: "+this.employeeName+" Designation: "+this.employeeDesignation+" Department: "+this.employeeDepartment+" Email: "+this.employeeEmail+" Number: "+this.employeeNumber+" Salary: "+this.employeeSalary+"\n";
    }
}
