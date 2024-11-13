/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_2;

public class Account {
   private int accountNumber;
   private Member accountOwner;
   private String accountBranch;
   private double accountBalance;

    public Account(int accountNumber, Member accountOwner, String accountBranch, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.accountBranch = accountBranch;
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Member getAccountOwner() {
        return accountOwner;
    }

    public String getAccountBranch() {
        return accountBranch;
    }

public String getOwnerEmail()
{
    return accountOwner.getMemberEmail();
}
public String getOwnerName()
{
    return accountOwner.getMemberName();
}
public String getOwnerContact()
{
    return accountOwner.getMemberContact();
}
public String displayInfo()
{return "Account Number: "+this.accountNumber+" Account Branch: "+this.accountBranch+" Account Balance: "+this.accountBalance+"\nMember Details:\n Owner Email: "+this.getOwnerEmail()+" Owner Name: "+this.getOwnerName()+" Owner Contact: "+this.getOwnerContact();}}
