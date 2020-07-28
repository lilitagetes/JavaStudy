package com.mybank.domain;

public class Main {
    public static void main(String[] args) {
        Account acct  = new Account(500);
        Customer cst = new Customer("Jane", "Smith");

        cst.setAccount(acct);
        acct.withdraw(150);
        acct.deposit(22.50);
        acct.withdraw(47.62);

        System.out.println("Customer [" + cst.getLastName()
                + ", " + cst.getFirstName() + "] has a balance of " +
                cst.getAccount().getBalance());
    }
}
