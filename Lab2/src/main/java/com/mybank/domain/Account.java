package com.mybank.domain;

public class Account {
        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return this.balance;
        }

        public void deposit(double amt) {
            System.out.println("Deposit " + amt);
            this.balance += amt;
        }

        public void withdraw(double amt) {
            System.out.println("Withdraw " + amt);
            this.balance -= amt;
        }
    }
