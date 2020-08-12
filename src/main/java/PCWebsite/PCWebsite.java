package PCWebsite;

import com.alex.first.java.project.*;

public class PCWebsite {
    public static void main(String[] args) {
        Screen screenHP = new Screen("HP", 13);
        Keyboard keyboardHP = new Keyboard("Bluetooth", "HP");
        Mouse mouseHP = new Mouse("Bluetooth", "HP");
        Computer computerHP = new Computer("Computer HP", screenHP, keyboardHP, mouseHP);
        
        Screen screenGamer = new Screen("Gamer", 40);
        Keyboard keyboardGamer = new Keyboard("Wire", "Gamer");
        Mouse mouseGamer = new Mouse("Wire", "Gamer");
        Computer computerGamer = new Computer("Computer Gamer", screenGamer, keyboardGamer, mouseGamer);
        
        Order order1 = new Order ();
        order1.addComputer(computerHP);
        order1.addComputer(computerGamer);
        
        order1.showOrder();
    }
}
