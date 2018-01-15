package com.company;

public class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdow) {
        threadCountdown = countdow;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
