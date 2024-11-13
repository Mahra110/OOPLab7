/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab07exercise01;

public class Lab07Exercise01 {

    public static void main(String[] args) {
        
        Staff s1=new Staff("three","Mahnoor","admin","CS","zahra@gmail.com",123,20000);
        Staff s2=new Staff("two","Zahra","supervisor","IT","zahra@gmail.com",456,10000);
Faculty f1=new Faculty("5 hours","Kashaf","Senior Lecturer","Biology","kashaf@gmail.com",678,90000);
Faculty f2=new Faculty("4 hours","Murtuza","Lecturer","Zoology","murtuza@gmail.com",798,80000);
Course c1=new Course("CS210","Computer Science","3");
Course c2=new Course("PS-11","IT","2");
Course c3=new Course("CAL-10","Biology","3");
        System.out.println("Assigning Course "+c1.getCourseName()+" to "+f1.employeeName );
        f1.assignCourse(c1);
        System.out.println("Assigning Course "+c2.getCourseName()+" to "+f2.employeeName );
                f2.assignCourse(c2);
        System.out.println("Assigning Course "+c3.getCourseName()+" to "+f1.employeeName );
                f1.assignCourse(c1);
                System.out.println("Displaying Faculties's Assigned Course List:");
Faculty.printCourseList();
        System.out.println("\nDisplaying Staff Details: ");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        
         System.out.println("\nDisplaying Faculty Details: ");
        System.out.println(f1.toString());
        System.out.print(f2.toString());

    }
}
