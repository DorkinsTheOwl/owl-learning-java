package com.owlcode;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // getter
    public String getModel() {
        return this.model;
    }
}
