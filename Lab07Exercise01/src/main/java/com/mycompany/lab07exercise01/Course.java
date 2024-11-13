/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab07exercise01;

public class Course {
  String courseCode,courseName,courseCreditHours;  

    public Course(String courseCode, String courseName, String courseCreditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCreditHours = courseCreditHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return """ 
               Code: """+this.courseCode+" Name:"+this.courseName+" Credit Hourse: "+this.courseCreditHours; 
    }
}
