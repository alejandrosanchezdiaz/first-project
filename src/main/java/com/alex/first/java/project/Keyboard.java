package com.alex.first.java.project;

public class Keyboard extends InputDevices {

    private final int idKeyboard;
    private static int keyboardCounter;

    public Keyboard(String typeOFInput, String brand) {
        super(typeOFInput, brand);
        idKeyboard = ++keyboardCounter;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "idKeyboard=" + idKeyboard + ", " + super.toString() + '}';
    }

}
