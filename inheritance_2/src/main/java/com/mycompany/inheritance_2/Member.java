/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_2;

public class Member {
    String memberName,memberEmail,memberContact;

    public Member(String memberName, String memberEmail, String memberContact) {
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberContact = memberContact;
    }

    public String getMemberContact() {
        return memberContact;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }  
}
