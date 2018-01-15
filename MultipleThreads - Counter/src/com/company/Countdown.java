package com.company;

public class Countdown {

    private int j;

    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

//        for (int i = 10; i > 0; i--) {
        synchronized (this) {
            for (j = 10; j > 0; j--) {
//            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
                System.out.println(color + Thread.currentThread().getName() + ": j = " + j);
            }
        }
    }
}
