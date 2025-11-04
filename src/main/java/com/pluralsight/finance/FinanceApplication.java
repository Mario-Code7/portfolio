package com.pluralsight.finance;

import java.util.Scanner;

public class FinanceApplication {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount("John", "11224", 12500);
//        Valuable valuableAccount = new CheckingAccount("Doom", "44577", 3000);
//
//        checkingAccount.deposit(200);
//
//        System.out.println("John's checking amount: " + checkingAccount.getValue());
//        System.out.println("Doom's checking amount: " + valuableAccount.getValue());

        Scanner myScanner = new Scanner(System.in);
        Portfolio portfolio = new Portfolio("My Portfolio", "John Wick");


        System.out.println(" ==== Welcome to your finance portfolio John Wick ====\n");
        boolean running = true;

        while (running) {
            System.out.println("\nChoose asset type to add: ");
            System.out.println("1. Checking account");
            System.out.println("2. Credit Card");
            System.out.println("3. Jewelry");
            System.out.println("4. Gold");
            System.out.println("5. House");
            System.out.println("0. Done, please show summary");
            System.out.print("Enter your choice: ");

            int choice = myScanner.nextInt();
            myScanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = myScanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNum = myScanner.nextLine();
                    System.out.print("Enter balance: ");
                    double balance = myScanner.nextDouble();
                    portfolio.addAsset(new CheckingAccount(name, accountNum, balance));
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    name = myScanner.nextLine();
                    System.out.print("Enter account number: ");
                    accountNum = myScanner.nextLine();
                    System.out.print("Enter balance owed: ");
                    balance = myScanner.nextDouble();
                    portfolio.addAsset(new CreditCard(name, accountNum, balance));
                    break;

                case 3:
                    System.out.print("Enter jewelry name: ");
                    name = myScanner.nextLine();
                    System.out.print("Enter karat number: ");
                    double karat = myScanner.nextDouble();
                    System.out.print("Enter market value: ");
                    double marketValue = myScanner.nextDouble();
                    portfolio.addAsset(new Jewelry(name, karat, marketValue));
                    break;

                case 4:
                    System.out.print("Enter gold name: ");
                    name = myScanner.nextLine();
                    System.out.print("Enter gold weight: ");
                    double weight = myScanner.nextDouble();
                    System.out.print("Enter market value: ");
                    marketValue = myScanner.nextDouble();
                    portfolio.addAsset(new Gold(name, weight, marketValue));
                    break;

                case 5:
                    System.out.print("Enter house name: ");
                    name = myScanner.nextLine();
                    System.out.print("Enter market value : ");
                    marketValue = myScanner.nextDouble();
                    System.out.print("Enter year built: ");
                    int yearBuilt = myScanner.nextInt();
                    System.out.print("Enter square feet: ");
                    int squareFeet = myScanner.nextInt();
                    System.out.print("Enter number of bedrooms: ");
                    int bedrooms = myScanner.nextInt();
                    portfolio.addAsset(new House(name, marketValue, yearBuilt, squareFeet, bedrooms));
                    break;

                case 0:
                running = false;
                default:
                    System.out.println("Invalid choice");
            }
        }
        System.out.println("\n===== Portfolio Summary ====");
        System.out.println("Total net value: $" + portfolio.getValue());
        Valuable mostValuable = portfolio.getMostValuable();
        Valuable leastValuable = portfolio.getLeastValuable();

        System.out.println("Most Valuable Asset: " + mostValuable);
        System.out.println("Least Valuable Asset: " + leastValuable);
        myScanner.close();
    }
}