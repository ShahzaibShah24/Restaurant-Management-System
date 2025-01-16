package restaurantmanagementsystem;
import javax.swing.*;
import java.awt.*; 
public class CompositePattern1 {
    private JFrame frame;
    private JTextArea textArea;
    CompositePattern1(){
        frame = new JFrame("Salads");
        frame.setBounds(470, 200, 530, 440);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setFont(new Font("Courier New", Font.PLAIN, 16));

        frame.add(panel);
        frame.setVisible(true);
        Salads CaeserSalad = new Salads("Caeser Salad",1000);
        Salads GreekSalad = new Salads("Greek Salad",1300);
        Salads CobbSalad = new Salads("Cobb Salad",1450);
        Salads WaldorfSalad = new Salads("Waldorf Salad",1650);
        Salads CapreseSalad = new Salads("Caprese Salad",1200);
        Salads NiçoiseSalad = new Salads("Niçoise Salad",950);
        Salads QuinoaSalad = new Salads("Quinoa Salad",850);
        Salads ThaiPapayaSalad = new Salads("Thai Papaya Salad",900);
        Salads BroccoliSalad = new Salads("Broccoli Salad",1150);
        Salads SpinachSalad = new Salads("Spinach Salad",1350);
        
        CaeserSalad.add(GreekSalad);CaeserSalad.add(CobbSalad);CaeserSalad.add(WaldorfSalad);
        CaeserSalad.add(CapreseSalad);CaeserSalad.add(NiçoiseSalad);CaeserSalad.add(QuinoaSalad);
        CaeserSalad.add(ThaiPapayaSalad);CaeserSalad.add(BroccoliSalad);CaeserSalad.add(SpinachSalad);
        
        textArea.append(CaeserSalad.toString() + "\n\n");
        for (Salads foodItems : CaeserSalad.getfoodItems()) {
            textArea.append(foodItems.toString() + "\n\n");
            for (Salads Items : foodItems.getfoodItems()) {
                textArea.append(Items.toString() + "\n\n");
                }
        }
    }
}
