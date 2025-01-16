package restaurantmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class BridgePattern {

    JFrame frame;

    BridgePattern() {
        frame = new JFrame("Urban Special");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        Restaurant vegDish1 = new VegFood(new VegChef());
        vegDish1.dish("Daal Makhni");
        JLabel vegLabel = new JLabel("Veg Dish: " + vegDish1.getDishName() + " Rs 850");
        vegLabel.setForeground(Color.WHITE);
        vegLabel.setFont(new Font("Courier New", Font.PLAIN, 16));
        panel.add(vegLabel);
        panel.setBackground(Color.BLACK);
        panel.setForeground(Color.WHITE);

        JLabel space = new JLabel(" ");
        panel.add(space);

        Restaurant vegDish2 = new VegFood(new VegChef());
        vegDish2.dish("Paneer Tikka Masala");
        JLabel vegLabel2 = new JLabel("Veg Dish: " + vegDish2.getDishName() + " Rs 750");
        vegLabel2.setForeground(Color.WHITE);
        vegLabel2.setFont(new Font("Courier New", Font.PLAIN, 16));
        panel.add(vegLabel2);
        panel.setBackground(Color.BLACK);
        panel.setForeground(Color.WHITE);

        JLabel space2 = new JLabel(" ");
        panel.add(space2);

        Restaurant vegDish3 = new VegFood(new VegChef());
        vegDish3.dish("Malai Kofta");
        JLabel vegLabel3 = new JLabel("Veg Dish: " + vegDish3.getDishName() + " Rs 800");
        vegLabel3.setForeground(Color.WHITE);
        vegLabel3.setFont(new Font("Courier New", Font.PLAIN, 16));
        panel.add(vegLabel3);
        panel.setBackground(Color.BLACK);
        panel.setForeground(Color.WHITE);

        JLabel space3 = new JLabel(" ");
        panel.add(space3);

        Restaurant vegDish4 = new VegFood(new VegChef());
        vegDish4.dish("Vegetable Pulao");
        JLabel vegLabel4 = new JLabel("Veg Dish: " + vegDish4.getDishName() + " Rs 1000");
        vegLabel4.setForeground(Color.WHITE);
        vegLabel4.setFont(new Font("Courier New", Font.PLAIN, 16));
        panel.add(vegLabel4);
        panel.setBackground(Color.BLACK);
        panel.setForeground(Color.WHITE);

        JLabel space4 = new JLabel(" ");
        panel.add(space4);

        Restaurant nonVegDish = new NonVegFood(new NonVegChef());
        nonVegDish.dish("Chicken Handi");
        JLabel nonVegLabel = new JLabel("NonVeg Dish: " + nonVegDish.getDishName() + " Rs 1600");
        nonVegLabel.setForeground(Color.WHITE);
        nonVegLabel.setFont(new Font("Courier New", Font.PLAIN, 16));
        panel.add(nonVegLabel);

        JLabel space5 = new JLabel(" ");
        panel.add(space5);

        Restaurant nonVegDish2 = new NonVegFood(new NonVegChef());
        nonVegDish2.dish("Nihari");
        JLabel nonVegLabel2 = new JLabel("NonVeg Dish: " + nonVegDish2.getDishName() + " Rs 700");
        nonVegLabel2.setForeground(Color.WHITE);
        nonVegLabel2.setFont(new Font("Courier New", Font.PLAIN, 16));
        panel.add(nonVegLabel2);

        JLabel space6 = new JLabel(" ");
        panel.add(space6);

        Restaurant nonVegDish3 = new NonVegFood(new NonVegChef());
        nonVegDish3.dish("Chapli Kebab");
        JLabel nonVegLabel3 = new JLabel("NonVeg Dish: " + nonVegDish3.getDishName() + " Rs 550");
        nonVegLabel3.setForeground(Color.WHITE);
        nonVegLabel3.setFont(new Font("Courier New", Font.PLAIN, 16));
        panel.add(nonVegLabel3);

        JLabel space7 = new JLabel(" ");
        panel.add(space7);

        Restaurant nonVegDish4 = new NonVegFood(new NonVegChef());
        nonVegDish4.dish("Paya (Trotters)");
        JLabel nonVegLabel4 = new JLabel("NonVeg Dish: " + nonVegDish4.getDishName() + " Rs 700");
        nonVegLabel4.setForeground(Color.WHITE);
        nonVegLabel4.setFont(new Font("Courier New", Font.PLAIN, 16));
        panel.add(nonVegLabel4);

        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
