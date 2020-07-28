package com.company;

public class Account {
    private
    double balance;

    public
    Account(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return this.balance;
    }

    void deposit(double amt) {
        this.balance += amt;
    }

    void withdraw(double amt) {
        this.balance -= amt;
    }
}
