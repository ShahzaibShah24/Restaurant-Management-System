package restaurantmanagementsystem;

import javax.swing.*;
import java.awt.*;

public class AdapterPattern {

    private JTextArea outputArea;

    AdapterPattern() {
        outputArea = new JTextArea();
        outputArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        outputArea.setBackground(Color.BLACK);
        outputArea.setForeground(Color.WHITE);
    }

    // Helper method to append text to the JTextArea
    public void appendToTextArea(String text) {
        outputArea.append(text + "\n");
    }

    public void initializeUI() {
        OwnRestaurant ownRestaurant = new OwnRestaurant(this);

        // Call the fishMenu method with different dish types and fish names
        ownRestaurant.fishMenu("Fried Fish", "Salmon ------------- Rs 500");
        ownRestaurant.fishMenu("Grilled Fish", "Halibut ---------- Rs 700");
        ownRestaurant.fishMenu("Grilled Fish", "Tuna ------------- Rs 450");
        ownRestaurant.fishMenu("Baked Fish", "Mahi Mahi ---------- Rs 550");
        ownRestaurant.fishMenu("Fried Fish", "Trout -------------- Rs 650");
        ownRestaurant.fishMenu("Fish Curry", "Cod ---------------- Rs 850");
        ownRestaurant.fishMenu("Baked Fish", "Halibut ------------ Rs 950");
        ownRestaurant.fishMenu("Grilled Fish", "Grouper --------- Rs 1050");
        ownRestaurant.fishMenu("Fish Curry", "Tilapia ------------ Rs 900"); 
        ownRestaurant.fishMenu("Baked Fish", "Red Snapper -------- Rs 900"); 
        ownRestaurant.fishMenu("Fried Fish", "Sardines ----------- Rs 900"); 

        // Create a JScrollPane to contain the JTextArea
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.getViewport().setBackground(Color.RED);

        // Create a JPanel to hold the JScrollPane
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        // Create a JFrame to display the output
        JFrame frame = new JFrame("Adapter Pattern Demo");
        frame.setBounds(450, 200, 560, 450);
        frame.getContentPane().add(panel);

        frame.setResizable(false);
        frame.setVisible(true);
    }
}
