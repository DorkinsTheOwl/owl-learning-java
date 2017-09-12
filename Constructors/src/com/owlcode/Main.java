package com.owlcode;

public class Main {

    public static void main(String[] args) {

//        BankAccount main = new BankAccount(1234567890, 1000, "Tom S.", "tom.s@mail.com", "20 032 233");
        BankAccount main = new BankAccount();

        System.out.println(main.getCustomerName() + " account number: " + main.getAccountNumber() +
        ", balance is " + main.getBalance() + ", email is " + main.getEmail() + " and phone number is " + main.getPhoneNumber());

        main.withdrawFunds(50);

        main.addFunds(100);

        System.out.println("Current balance of " + main.getCustomerName() + " is " + main.getBalance());

        BankAccount tomsAccount = new BankAccount("Tom", "tom@email.com", "20 989 989");
        System.out.println(tomsAccount.getAccountNumber() + " name " + tomsAccount.getCustomerName());

        System.out.println("***************************");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        System.out.println("***************************");

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        System.out.println("***************************");

        VipCustomer person3 = new VipCustomer("Tom", 33000.00, "tom@mail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());

    }
}
