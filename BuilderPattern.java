package restaurantmanagementsystem;

import java.awt.*;
import javax.swing.*;

public class BuilderPattern {

    BuilderPattern() {
        DealBuilder dealBuilder = new DealBuilder();

        Deal deal1 = dealBuilder.prepareDeal1();
        Deal deal2 = dealBuilder.prepareDeal2();
        Deal deal3 = dealBuilder.prepareDeal3();
        Deal deal4 = dealBuilder.prepareDeal4();
        Deal deal5 = dealBuilder.prepareDeal5();
        Deal deal6 = dealBuilder.prepareDeal6();
        // Create a JTextArea to display the output
        JTextArea outputArea = new JTextArea();
        outputArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        outputArea.setBackground(Color.BLACK);
        outputArea.setForeground(Color.WHITE);

        // Append the output to the JTextArea
        appendToTextArea(outputArea, "Deal 1");
        appendToTextArea(outputArea, "-------------------");
        appendToTextArea(outputArea, deal1.showItems());
        appendToTextArea(outputArea, "Total Cost: Rs: " + deal1.getCost());
        appendToTextArea(outputArea, "");

        appendToTextArea(outputArea, "Deal 2");
        appendToTextArea(outputArea, "-------------------");
        appendToTextArea(outputArea, deal2.showItems());
        appendToTextArea(outputArea, "Total Cost: Rs: " + deal2.getCost());
        appendToTextArea(outputArea, "");

        appendToTextArea(outputArea, "Deal 3");
        appendToTextArea(outputArea, "-------------------");
        appendToTextArea(outputArea, deal3.showItems());
        appendToTextArea(outputArea, "Total Cost: Rs: " + deal3.getCost());
        appendToTextArea(outputArea, "");

        appendToTextArea(outputArea, "Deal 4");
        appendToTextArea(outputArea, "-------------------");
        appendToTextArea(outputArea, deal3.showItems());
        appendToTextArea(outputArea, "Total Cost: Rs: " + deal4.getCost());
        appendToTextArea(outputArea, "");

        appendToTextArea(outputArea, "Deal 5");
        appendToTextArea(outputArea, "-------------------");
        appendToTextArea(outputArea, deal3.showItems());
        appendToTextArea(outputArea, "Total Cost: Rs: " + deal5.getCost());
        appendToTextArea(outputArea, "");

        appendToTextArea(outputArea, "Deal 6");
        appendToTextArea(outputArea, "-------------------");
        appendToTextArea(outputArea, deal3.showItems());
        appendToTextArea(outputArea, "Total Cost: Rs: " + deal6.getCost());
        // Create a JScrollPane to contain the JTextArea
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.getViewport().setBackground(Color.red);

        // Create a JPanel to hold the JScrollPane
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        // Create a JFrame to display the output
        JFrame frame = new JFrame("Deals");
        frame.setBounds(400, 150, 650, 450);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    // Helper method to append text to the JTextArea
    private static void appendToTextArea(JTextArea textArea, String text) {
        textArea.append(text + "\n");

    }
}
