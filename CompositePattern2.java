package restaurantmanagementsystem;
import javax.swing.*;
import java.awt.*; 
public class CompositePattern2 {
    private JFrame frame;
    private JTextArea textArea;
    CompositePattern2(){
        frame = new JFrame("Desserts");
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
        Desserts IceCreamSundae = new Desserts("Ice Cream Sundae",550);
        Desserts FruitTart = new Desserts("Fruit Tart",900);
        Desserts CrèmeBrûlée = new Desserts("Crème Brûlée",1100);
        Desserts Tiramisu = new Desserts("Tiramisu",950);
        Desserts ChocolateMousse = new Desserts("Chocolate Mousse",1250);
        Desserts RicePudding = new Desserts("Rice Pudding",750);
        Desserts ChocolateFondue = new Desserts("Chocolate Fondue",650);
        Desserts AppleCrumble = new Desserts("Apple Crumble",1000);
        Desserts BananaSplit = new Desserts("Banana Split",550);
        Desserts LemonSorbet = new Desserts("Lemon Sorbet",1350);
        
        IceCreamSundae.add(FruitTart);IceCreamSundae.add(CrèmeBrûlée);IceCreamSundae.add(Tiramisu);
        IceCreamSundae.add(ChocolateMousse);IceCreamSundae.add(RicePudding);IceCreamSundae.add(ChocolateFondue);
        IceCreamSundae.add(AppleCrumble);IceCreamSundae.add(BananaSplit);IceCreamSundae.add(LemonSorbet);
        textArea.append(IceCreamSundae.toString() + "\n\n");
        for (Desserts foodItems : IceCreamSundae.getfoodItems()) {
            textArea.append(foodItems.toString() + "\n\n");
            for (Desserts Items : foodItems.getfoodItems()) {
                textArea.append(Items.toString() + "\n\n");
                }
        }
    }
}
