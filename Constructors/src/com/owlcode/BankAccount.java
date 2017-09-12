package com.owlcode;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // constructor
    public BankAccount() {
        // this() needs to be first statement
        this(12312313, 500, "Default name", "default@email.com", "20 999 999");
        System.out.println("Default constructor called");
    }

    // constructor
    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        System.out.println("BankAccount constructor called with params.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // constructor
    public BankAccount(String customerName, String email, String phoneNumber) {
        this(111111, 50, customerName, email, phoneNumber);
    }

    public void addFunds(int amount) {
        this.balance += amount;
        System.out.println(amount + " has been added to balance.");
    }

    public void withdrawFunds(int amount) {
        if ((this.balance - amount) >= 0) {
            this.balance -= amount;
            System.out.println(amount + " has been withdrawn.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void setAccountNumber(int accNumber) {
        this.accountNumber = accNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
