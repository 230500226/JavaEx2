/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaex2;

/**
 *
 * @author ldxt460s
 */
import java.math.BigDecimal;
public class Account {

    private BigDecimal balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = BigDecimal.valueOf(initialBalance);
        } else {
            throw new IllegalArgumentException("Initial balance must be positive.");
        }
    }

    public void debit(double amount) {
        BigDecimal debitAmount = BigDecimal.valueOf(amount);
        if (debitAmount.compareTo(balance) > 0) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance = balance.subtract(debitAmount);
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance = balance.add(BigDecimal.valueOf(amount));
        } else {
            System.out.println("Credit amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.printf("The account balance is: %.2f\n", getBalance());
    }

    public static void main(String[] args) {
        Account myAccount = new Account(100.00);
        myAccount.displayBalance();
        myAccount.debit(50.00);
        myAccount.displayBalance();
        myAccount.debit(60.00);
        myAccount.displayBalance();
    }
}
