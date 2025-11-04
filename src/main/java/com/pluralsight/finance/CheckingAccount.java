package com.pluralsight.finance;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void deposit(double amount) {
        super.setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {

    }

    public double getValue() {
        return getBalance();
    }

    @Override
    public String toString() {
        return getName() + " (Account #" + getAccountNumber() + ") - $" + getValue();
    }
}
