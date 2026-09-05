/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private final BankAccount account = new BankAccount();

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdrawValid() {
        account.deposit(500);
        account.withdraw(200);
        assertEquals(300, account.getBalance());
    }

    @Test
    void testWithdrawBeyondBalance() {
        account.deposit(100);
        assertThrows(IllegalStateException.class, () -> account.withdraw(200));
    }

    @Test
    void testDepositNegative() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }
}