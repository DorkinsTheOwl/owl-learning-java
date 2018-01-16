package com.company;

public class Main {

    public static void main(String[] args) {
        final PolitePerson tom = new PolitePerson("Tom");
        final PolitePerson alexander = new PolitePerson("Alexander");

        new Thread(new Runnable() {
            @Override
            public void run() {
                tom.sayHello(alexander);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                alexander.sayHello(tom);
            }
        }).start();
    }

    static class PolitePerson {
        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello to me!%n", this.name, person.getName());
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(PolitePerson person) {
            System.out.printf("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
        }
    }
}
