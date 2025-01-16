package restaurantmanagementsystem;
import javax.swing.*;
import java.awt.*; 
public class CompositePattern3 {
    private JFrame frame;
    private JTextArea textArea;
    CompositePattern3(){
        frame = new JFrame("Cakes");
        frame.setBounds(470, 200, 580, 460);

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
        Cakes RedVelvet = new Cakes("Red Velvet Cake",1350);
        Cakes ChocolateFudge = new Cakes("Chocolate Fudge Cake",1450);
        Cakes VanillaButtercream = new Cakes("Vanilla Buttercream Cake",1550);
        Cakes Carrot = new Cakes("Carrot Cake",1800);
        Cakes LemonPound = new Cakes("Lemon Pound Cake",2500);
        Cakes BlackForest = new Cakes("Black Forest Cake",1500);
        Cakes Marble = new Cakes("Marble Cake",1100);
        Cakes CoconutCream = new Cakes("Coconut Cream Cake",1800);
        Cakes OreoCheesecake = new Cakes("Oreo Cheesecake",1850);
        Cakes MatchaGreenTea = new Cakes("Matcha Green Tea Cake",1950);
        
        RedVelvet.add(ChocolateFudge);RedVelvet.add(VanillaButtercream);RedVelvet.add(Carrot);
        RedVelvet.add(LemonPound);RedVelvet.add(BlackForest);RedVelvet.add(Marble);
        RedVelvet.add(CoconutCream);RedVelvet.add(OreoCheesecake);RedVelvet.add(MatchaGreenTea);

        textArea.append(RedVelvet.toString() + "\n\n");
        for (Cakes foodItems : RedVelvet.getfoodItems()) {
            textArea.append(foodItems.toString() + "\n\n");
            for (Cakes Items : foodItems.getfoodItems()) {
                textArea.append(Items.toString() + "\n\n");
                }
        }
    }
}
