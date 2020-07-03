package com.alex.first.java.project;

public class Mouse extends InputDevices {

    private final int idMouse;
    private static int mouseCounter;

    public Mouse(String typeOFInput, String brand) {
        super(typeOFInput, brand);
        idMouse = ++mouseCounter;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + '}';
    }

}
