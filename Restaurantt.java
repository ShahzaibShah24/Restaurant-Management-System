package restaurantmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Restaurantt {
    private static JFrame frame;
    private static JTextArea textArea;
    
    public static void placeOrder(Customer customer, String order) {
        String output = customer.getDate() + " - order received from " + customer.getName() + " | Food Item: " + order;
        
        if (textArea != null) {
            textArea.append(output + "\n\n");
        }
    }
    
    public static void createAndShowGUI() {
        frame = new JFrame("Orders");
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.CYAN);
        textArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        
        frame.setBounds(400, 150, 900, 475);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

