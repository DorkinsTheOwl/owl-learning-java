package com.owlcode;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinter = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinter + ". New total print count for printer = " + printer.getPagesPrinted());

        pagesPrinter = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinter + ". New total print count for printer = " + printer.getPagesPrinted());
    }
}
