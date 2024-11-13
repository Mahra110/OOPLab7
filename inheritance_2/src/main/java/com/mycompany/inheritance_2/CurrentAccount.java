/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_2;

public class CurrentAccount extends Account{
   private String accountType;
    public CurrentAccount(String accountType, int accountNumber, Member accountOwner, String accountBranch, double accountBalance) {
        super(accountNumber, accountOwner, accountBranch, accountBalance);
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }
@Override
  public String displayInfo(){
     return super.displayInfo()+" Account Type: "+this.accountType;
  }
}
