package com.alex.first.java.project;

public class Order {
    private final int idOrder;
    private Computer computer[];
    private static int orderCounter;
    private static final int MAX_COMPUTER = 10;
    private int computerCounter;
    
    public Order(){
        this.idOrder = ++orderCounter;
        this.computer = new Computer [Order.MAX_COMPUTER];
    }
    
    public void addComputer(Computer computer){
        if(this.computerCounter < Order.MAX_COMPUTER){
            this.computer[this.computerCounter++] = computer;
            
        }
        else {
            System.out.println("You have pass the limit: " + Order.MAX_COMPUTER);
        }
    }
    
    public void showOrder(){
        System.out.println("Order #" + this.idOrder);
        System.out.println("Computers of the order #" + this.idOrder);
        for (int i = 0; i < this.computerCounter; i++) {
            System.out.println(this.computer[i]);
        }
    }
}
