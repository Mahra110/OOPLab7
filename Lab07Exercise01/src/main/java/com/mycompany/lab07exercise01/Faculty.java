/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab07exercise01;
import java.util.ArrayList;
public class Faculty extends Employee {
    public String workingHours;
    public static ArrayList<Course> courseList;

    public Faculty(String workingHours, String employeeName, String employeeDesignation, String employeeDepartment, String employeeEmail, int employeeNumber, int employeeSalary) {
        super(employeeName, employeeDesignation, employeeDepartment, employeeEmail, employeeNumber, employeeSalary);
        this.workingHours = workingHours;
                courseList=new ArrayList<>();

    }

    public void assignCourse(Course course ){
    courseList.add(course);
        System.out.println("Course assigned successfully\n");
    }
    
    public static void printCourseList()
    { 
        for(Course courses:courseList)
        {
            System.out.println(courses);
        }
    }
    @Override
    public String toString() {
return super.toString()+"Working Hours: "+this.workingHours;
    }   
}
