package com.owlcode;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Swedbank");

        if (bank.addBranch("Riga")) {
            System.out.println("Riga branch created");
        }

        bank.addCustomer("Riga", "Tom", 40.32);
        bank.addCustomer("Riga", "Tim", 32.11);
        bank.addCustomer("Riga", "Bob", 412.98);

        bank.addBranch("Ventspils");
        bank.addCustomer("Ventspils", "Brad", 130.98);

        bank.addCustomerTransaction("Riga", "Tom", 23.22);
        bank.addCustomerTransaction("Riga", "Tom", 13.31);
        bank.addCustomerTransaction("Riga", "Bob", 54.65);

        bank.listCustomers("Riga", true);
        bank.listCustomers("Ventspils", true);

        bank.addBranch("Liepaja");

        if (!bank.addCustomer("Liepaja", "Brian", 5.33)) {
            System.out.println("Error: Liepaja does not exist");
        }

        if (!bank.addBranch("Riga")) {
            System.out.println("Riga branch already exists");
        }

        if (!bank.addCustomerTransaction("Riga", "Jim", 23.22)) {
            System.out.println("Customer does not exist at that branch");
        }

        if (!bank.addCustomer("Riga", "Tom", 12.34)) {
            System.out.println("Customer Tom already exists");
        }
    }
}
