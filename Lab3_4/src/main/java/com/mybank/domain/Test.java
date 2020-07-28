package com.mybank.domain;

public class Test {
    public void CustomerTest()
    {
        Account acct  = new Account(500);
        Customer cst = new Customer("Jane", "Smith");
        boolean rc = false;

        System.out.println("Creating the customer " + cst.getFirstName() + " " + cst.getLastName());

        cst.setAccount(acct);
        System.out.println("Setting customer's account with a " + cst.getAccount().getBalance() + " balance");

        double amt = 150;
        rc = acct.withdraw(amt);
        System.out.println("Withdraw " + amt + ": " + rc);

        amt = 22.50;
        rc = acct.deposit(amt);
        System.out.println("Deposit " + amt + ": " + rc);

        amt = 47.62;
        rc = acct.withdraw(amt);
        System.out.println("Withdraw " + amt + ": " + rc);

        amt = 400;
        rc = acct.withdraw(amt);
        System.out.println("Withdraw " + amt + ": " + rc);

        System.out.println("Customer [" + cst.getLastName()
                + ", " + cst.getFirstName() + "] has a balance of " +
                cst.getAccount().getBalance());
    }
}
