package com.alex.first.java.project;

public class InputDevices {

    private String typeOfInput;
    private String brand;

    public InputDevices(String typeOFInput, String brand) {
        this.typeOfInput = typeOfInput;
        this.brand = brand;
    }

    public String getTypeOfInput() {
        return typeOfInput;
    }

    public void setTypeOfInput(String typeOfInput) {
        this.typeOfInput = typeOfInput;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "InputDevices{" + "typeOfInput=" + typeOfInput + ", brand=" + brand + '}';
    }

}
