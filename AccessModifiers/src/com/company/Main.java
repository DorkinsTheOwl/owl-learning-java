package com.company;

public class Main {

    public static void main(String[] args) {
        Account tomsAccount = new Account("Tom");
        tomsAccount.deposit(1000);
        tomsAccount.withdraw(500);
        tomsAccount.withdraw(-200);
        tomsAccount.deposit(-20);
        tomsAccount.calculateBalance();

        System.out.println("Balance on account is " + tomsAccount.getBalance());
    }
}
