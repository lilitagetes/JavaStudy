package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account act;
        act = new Account(100);

        int myInt;

        System.out.println("Classloader of Account class:"
                + Account.class.getClassLoader());

        System.out.println("Classloader of int: " + int.class.getClassLoader());

        System.out.println("The start balance is: " + act.getBalance());

        System.out.println("Customer added 50.");
        act.deposit(50);
        System.out.println("Now balance is: " + act.getBalance());

        System.out.println("Customer got 25 from the account.");
        act.withdraw(25);
        System.out.println("Now balance is: " + act.getBalance());


    }
}
