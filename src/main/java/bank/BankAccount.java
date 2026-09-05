/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

public class BankAccount {
    private double balance;

    public void deposit(double amt) {
        if (amt < 0) throw new IllegalArgumentException("Deposit cannot be negative.");
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) throw new IllegalStateException("Insufficient balance.");
        balance -= amt;
    }

    public double getBalance() { return balance; }
}
