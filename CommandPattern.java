package restaurantmanagementsystem;

import java.awt.Color;
import javax.swing.*;

public class CommandPattern {

    private JTextArea outputTextArea;

    CommandPattern() {
        Kitchen FoodItem = new Kitchen();
        BuyItems buyItem = new BuyItems(FoodItem);
        SeLLItems sellItem = new SeLLItems(FoodItem);

        Manager manager = new Manager();
        manager.takeOrder(buyItem);
        manager.takeOrder(sellItem);
        JFrame frame = new JFrame("Inventory");
        frame.setBounds(450, 150, 450, 450);

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        outputTextArea.setBackground(Color.BLACK);
        outputTextArea.setForeground(Color.CYAN);
        frame.add(scrollPane);

        FoodItem.setOutputTextArea(outputTextArea);

        frame.setVisible(true);
        manager.placeOrders();
    }
}
