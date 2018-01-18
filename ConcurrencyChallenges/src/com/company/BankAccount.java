package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private double balance;
    private String accountNumber;

    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

//    public synchronized void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited " + amount + ". New Balance is " + this.balance);
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//        System.out.println("Withdrawn " + amount + ". New Balance is " + this.balance);
//    }

//    public void deposit(double amount) {
//        synchronized (this) {
//            balance += amount;
//            System.out.println("Deposited " + amount + ". New Balance is " + this.balance);
//        }
//    }
//
//    public void withdraw(double amount) {
//        synchronized (this) {
//            balance -= amount;
//            System.out.println("Withdrawn " + amount + ". New Balance is " + this.balance);
//        }
//    }

//    public void deposit(double amount) {
//        lock.lock();
//        try {
//            balance += amount;
//            System.out.println("Deposited " + amount + ". New Balance is " + this.balance);
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public void withdraw(double amount) {
//        lock.lock();
//        try {
//            balance -= amount;
//            System.out.println("Withdrawn " + amount + ". New Balance is " + this.balance);
//        } finally {
//            lock.unlock();
//        }
//    }

//    public void deposit(double amount) {
//        try {
//            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//                try {
//                    balance += amount;
//                    System.out.println("Deposited " + amount + ". New Balance is " + this.balance);
//                } finally {
//                    lock.unlock();
//                }
//            } else {
//                System.out.println("Couldn't get the lock");
//            }
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void withdraw(double amount) {
//        try {
//            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//                try {
//                    balance -= amount;
//                    System.out.println("Withdrawn " + amount + ". New Balance is " + this.balance);
//                } finally {
//                    lock.unlock();
//                }
//            } else {
//                System.out.println("Couldn't get the lock");
//            }
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public void deposit(double amount) {
        boolean status = false;

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = true;
                    System.out.println("Deposited " + amount + ". New Balance is " + this.balance);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get the lock");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount) {
        boolean status = false;

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                    System.out.println("Withdrawn " + amount + ". New Balance is " + this.balance);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get the lock");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number: " + this.accountNumber);
    }
}