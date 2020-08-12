package com.alex.first.java.project;

public class Computer {
    
    private final int idComputer;
    private String name;
    private Screen screen;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computerCounter;
    
    private Computer(){
        this.idComputer = ++idComputer;
    }
  
    public Computer (String name, Screen screen, Keyboard keyboard, Mouse mouse){
        this();
        this.name = name;
        this.screen = screen;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" + "idComputer =" + idComputer + ", name =" + name + ", screen =" + screen + ", keyboard =" + keyboard + ", mouse =" + mouse + '}';
    }
    
    
}
