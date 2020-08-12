package com.alex.first.java.project;

public class Screen {
    private final int idScreen;
    private String brand;
    private double size;
    private static int screenCounter;
    
    private Screen() {
        this.idScreen = ++screenCounter;
        
    }
    
    public Screen(String brand, double size){
        this();
        this.brand = brand;
        this.size = size;
    }
    
    public int getidScreen(){
        return this.idScreen;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Screen{" + "idScreen=" + idScreen + ", brand=" + brand + ", size=" + size + '}';
    }
   
    
}
