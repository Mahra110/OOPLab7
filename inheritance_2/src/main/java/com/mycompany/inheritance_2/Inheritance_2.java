/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inheritance_2;

import java.util.Scanner; 
public class Inheritance_2 {
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name1=sc.nextLine();
        System.out.println("Enter gmail: ");
        String gmail1=sc.nextLine();
        System.out.println("Enter number: ");
        String contact1=sc.nextLine();
        Member member1 = new Member(name1,gmail1,contact1);
        
        System.out.println("Enter name: ");
        String name2=sc.nextLine();
        System.out.println("Enter gmail: ");
        String gmail2=sc.nextLine();
        System.out.println("Enter number: ");
        String contact2=sc.nextLine();
        Member member2 = new Member(name2,gmail2,contact2);
        
        System.out.println("Enter name: ");
        String name3=sc.nextLine();
        System.out.println("Enter gmail: ");
        String gmail3=sc.nextLine();
        System.out.println("Enter number: ");
        String contact3=sc.nextLine();
        Member member3 = new Member(name3,gmail3,contact3);
        System.out.println("Adding member 1 & 2 to Current Account:\n");
      CurrentAccount ca1=new CurrentAccount("Current Account",2084,member1,"Branch 1",3000.40);
      CurrentAccount ca2=new CurrentAccount("Current Account",9900,member2,"Branch 2",999.90);
              System.out.println("Adding member 3 to Current Account:\n");

      SavingAccount sa1=new SavingAccount("Saving Account",2300,member3,"Branch 1",777.95);
        System.out.println("\nDisplaying Information:\n");
        
        System.out.println(ca1.displayInfo());
        System.out.println(ca2.displayInfo());
        System.out.println(sa1.displayInfo());
        
    }}
