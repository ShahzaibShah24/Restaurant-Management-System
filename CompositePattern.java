package restaurantmanagementsystem;
import javax.swing.*;
import java.awt.*;  
public class CompositePattern {
    private JFrame frame;
    private JTextArea textArea;
    CompositePattern() {
        frame = new JFrame("Vegetarian");
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
        Vegetarian Soup = new Vegetarian("Mushroom Soup",450);
        Vegetarian CapreseSalad = new Vegetarian("Caprese Panini",550);
        Vegetarian FalafelWrap = new Vegetarian("Falafel Wrap",600);
        Vegetarian VegetableBiryani = new Vegetarian("Vegetable Biryani",650);
        Vegetarian VeggieBurger = new Vegetarian("Veggie Burger",250);
        Vegetarian VeggieStirFry = new Vegetarian("Veggie Stir-Fry",800);
        Vegetarian GreekSalad = new Vegetarian("Veg Sushi Roll",450);
        Vegetarian VeggieFajitas = new Vegetarian("Veggie Fajitas",750);
        Vegetarian VegetarianCurry = new Vegetarian("Vegetarian Curry",750);
        Vegetarian LentilCurry = new Vegetarian("Lentil Curry",900);
        
        Soup.add(CapreseSalad);Soup.add(FalafelWrap);Soup.add(VegetableBiryani);
        Soup.add(VeggieBurger);Soup.add(VeggieStirFry);Soup.add(GreekSalad);
        Soup.add(VeggieFajitas);Soup.add(VegetarianCurry);Soup.add(LentilCurry);
        
textArea.append(Soup.toString() + "\n\n");
        for (Vegetarian foodItems : Soup.getfoodItems()) {
            textArea.append(foodItems.toString() + "\n\n");
            for (Vegetarian Items : foodItems.getfoodItems()) {
                textArea.append(Items.toString() + "\n\n");
                }
        }
    }
}
