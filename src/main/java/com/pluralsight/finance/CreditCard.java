package com.pluralsight.finance;

public class CreditCard extends Account {
    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void charge(double amount) {

    }

    public void pay(double amount) {

    }

    @Override
    public double getValue() {
        return -getBalance();
    }

    @Override
    public String toString() {
        return getName() + "Credit card (Balance Owed: $" + getValue() + ")";
    }
}
