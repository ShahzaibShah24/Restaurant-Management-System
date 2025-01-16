package restaurantmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class NullObjectPattern {

    private JTextField drinkNameField;
    private JButton getDrinkButton;
    private JLabel nameLabel;
    private JLabel priceLabel;

    public NullObjectPattern() {
        JFrame frame = new JFrame("Drinks");
        frame.setLayout(null);
        frame.setBounds(550, 300, 400, 260);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 260);
        panel.setBackground(Color.BLACK);

        drinkNameField = new JTextField();
        getDrinkButton = new JButton("Get Drink");
        nameLabel = new JLabel("Name:");
        priceLabel = new JLabel("Price:");

        drinkNameField.setBounds(90, 30, 200, 25);
        getDrinkButton.setBounds(140, 70, 150, 25);
        nameLabel.setBounds(90, 120, 250, 25);
        priceLabel.setBounds(90, 150, 150, 25);

        Font font = new Font("Courier New", Font.PLAIN, 14);
        drinkNameField.setFont(font);
        nameLabel.setFont(font);
        priceLabel.setFont(font);
        
        getDrinkButton.setBackground(Color.DARK_GRAY);
        getDrinkButton.setFont(new Font("Comic Sans", Font.BOLD, 14));
        getDrinkButton.setForeground(Color.LIGHT_GRAY);
        getDrinkButton.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        getDrinkButton.setFocusable(false);

        nameLabel.setForeground(Color.WHITE);
        priceLabel.setForeground(Color.WHITE);

        getDrinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String drinkName = drinkNameField.getText();
                Drinks drink = DrinksFactory.getDrink(drinkName);
                nameLabel.setText("Name: " + drink.getName());
                priceLabel.setText("Price: Rs " + drink.getPrice());
            }
        });

        panel.add(drinkNameField);
        panel.add(getDrinkButton);
        panel.add(nameLabel);
        panel.add(priceLabel);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}