/*
Create a custom checked exception named InsufficientBalanceException if the withdrawal amount is greater than the account balance.
Create a custom checked exception named InvalidPinException if the entered PIN is incorrect.
Use IllegalArgumentException if the withdrawal amount is zero or negative.
Create a class BankAccount with account holder name, PIN and balance.
Initialize these values using a parameterized constructor.
Create a method withdraw() that uses throws to declare the custom exceptions.
Use try-catch to handle all exceptions and display the error using getMessage().
Use InputMismatchException to handle invalid input types.
If the withdrawal is successful, display the withdrawn amount and remaining balance. */

import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidPinException extends Exception {
    InvalidPinException(String msg) {
        super(msg);
    }
}

class BankAccount {
    String name;
    int atmPin;
    int balance;
   
    BankAccount(String name, int atmPin, int balance) {
        this.name = name;
        this.atmPin = atmPin;
        this.balance = balance;
    }

    public void withdraw(int enteredPin, int amount) throws InsufficientBalanceException, InvalidPinException {

        if (enteredPin != atmPin) {
            throw new InvalidPinException("Incorrect PIN. Try again.");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Deposit money first!");
        }

        balance = balance - amount;

        System.out.println("\n----- Bank System -----");
        System.out.println("Account Holder: " + name);
        System.out.println("Withdrawal Amount: " + amount);
        System.out.println("Remaining Balance: " + balance);
        System.out.println("Withdrawal successful!");
    }
}

public class BankATM {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Actual, correct ATM PIN
        int correctPin = 2006;

        try {
            System.out.print("Enter account holder name: ");
            String name = sc.nextLine();

            System.out.print("Enter bank balance: ");
            int balance = sc.nextInt();

            System.out.print("Enter ATM PIN: ");
            int enteredPin = sc.nextInt();

            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            BankAccount bk = new BankAccount(name, correctPin, balance);
            bk.withdraw(enteredPin, amount);

        } 
        catch (InvalidPinException | InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());

        } 
        catch (InputMismatchException e) {
            System.out.println("Exception: Please enter numbers for balance, PIN and amount.");
        }
        sc.close();
    }
}
