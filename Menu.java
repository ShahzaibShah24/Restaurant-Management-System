package restaurantmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Menu extends JFrame implements ActionListener {

    JFrame frame;
    JButton Deals, Fish, Desserts, Cakes,
            Urban_Special, Salads, Vegetarian, Drinks, Back;
    JLabel dealsImage, fishImage, dessertsImage, cakesImage, MenuImage,
            specialImage, saladsImage, vegetarianImage, drinksImage;

    Menu() {

        frame = new JFrame("Urban Eat");
        frame.setBounds(-8, 0, 1570, 822);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon menu = new ImageIcon(getClass().getResource("Menubg2.jpg"));
        MenuImage = new JLabel();
        MenuImage.setIcon(menu);
        MenuImage.setBounds(0, 0, 1570, 822);
        MenuImage.setVisible(true);

        Deals = new JButton("Deals");
        Deals.setBounds(150, 250, 250, 50);
        Deals.setFocusable(false);
        Deals.setBackground(Color.DARK_GRAY);
        Deals.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Deals.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Deals.setForeground(Color.LIGHT_GRAY);
        Deals.addActionListener(this);

        Fish = new JButton("Fish");
        Fish.setBounds(450, 250, 250, 50);
        Fish.setFocusable(false);
        Fish.setBackground(Color.DARK_GRAY);
        Fish.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Fish.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Fish.setForeground(Color.LIGHT_GRAY);
        Fish.addActionListener(this);

        Urban_Special = new JButton("Urban Special");
        Urban_Special.setBounds(750, 250, 250, 50);
        Urban_Special.setFocusable(false);
        Urban_Special.setBackground(Color.DARK_GRAY);
        Urban_Special.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Urban_Special.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Urban_Special.setForeground(Color.LIGHT_GRAY);
        Urban_Special.addActionListener(this);

        Vegetarian = new JButton("Vegetarian");
        Vegetarian.setBounds(1050, 250, 250, 50);
        Vegetarian.setFocusable(false);
        Vegetarian.setBackground(Color.DARK_GRAY);
        Vegetarian.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Vegetarian.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Vegetarian.setForeground(Color.LIGHT_GRAY);
        Vegetarian.addActionListener(this);

        Salads = new JButton("Salads");
        Salads.setBounds(150, 650, 250, 50);
        Salads.setFocusable(false);
        Salads.setBackground(Color.DARK_GRAY);
        Salads.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Salads.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Salads.setForeground(Color.LIGHT_GRAY);
        Salads.addActionListener(this);

        Desserts = new JButton("Desserts");
        Desserts.setBounds(450, 650, 250, 50);
        Desserts.setFocusable(false);
        Desserts.setBackground(Color.DARK_GRAY);
        Desserts.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Desserts.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Desserts.setForeground(Color.LIGHT_GRAY);
        Desserts.addActionListener(this);

        Cakes = new JButton("Cakes");
        Cakes.setBounds(750, 650, 250, 50);
        Cakes.setFocusable(false);
        Cakes.setBackground(Color.DARK_GRAY);
        Cakes.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Cakes.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Cakes.setForeground(Color.LIGHT_GRAY);
        Cakes.addActionListener(this);

        Drinks = new JButton("Drinks");
        Drinks.setBounds(1050, 650, 250, 50);
        Drinks.setFocusable(false);
        Drinks.setBackground(Color.DARK_GRAY);
        Drinks.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Drinks.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Drinks.setForeground(Color.LIGHT_GRAY);
        Drinks.addActionListener(this);

        Back = new JButton("<");
        Back.setBounds(0, 0, 50, 50);
        Back.setFocusable(false);
        Back.setBackground(Color.DARK_GRAY);
        Back.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        Back.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Back.setForeground(Color.LIGHT_GRAY);
        Back.addActionListener(this);

        ImageIcon desserts = new ImageIcon(getClass().getResource("desserts5.png"));
        dessertsImage = new JLabel();
        dessertsImage.setIcon(desserts);
        dessertsImage.setBounds(470, 400, 250, 250);
        dessertsImage.setVisible(true);

        ImageIcon cakes = new ImageIcon(getClass().getResource("cake.png"));
        cakesImage = new JLabel();
        cakesImage.setIcon(cakes);
        cakesImage.setBounds(770, 400, 250, 250);
        cakesImage.setVisible(true);

        ImageIcon special = new ImageIcon(getClass().getResource("special3.png"));
        specialImage = new JLabel();
        specialImage.setIcon(special);
        specialImage.setBounds(750, 0, 250, 250);
        specialImage.setVisible(true);

        ImageIcon salads = new ImageIcon(getClass().getResource("salads3.png"));
        saladsImage = new JLabel();
        saladsImage.setIcon(salads);
        saladsImage.setBounds(170, 400, 250, 250);
        saladsImage.setVisible(true);

        ImageIcon vegetarian = new ImageIcon(getClass().getResource("vegetarian2.png"));
        vegetarianImage = new JLabel();
        vegetarianImage.setIcon(vegetarian);
        vegetarianImage.setBounds(1070, 0, 250, 250);
        vegetarianImage.setVisible(true);

        ImageIcon drinks = new ImageIcon(getClass().getResource("drinks2.png"));
        drinksImage = new JLabel();
        drinksImage.setIcon(drinks);
        drinksImage.setBounds(1070, 400, 250, 250);
        drinksImage.setVisible(true);

        ImageIcon deals = new ImageIcon(getClass().getResource("deals2.png"));
        dealsImage = new JLabel();
        dealsImage.setIcon(deals);
        dealsImage.setBounds(180, 0, 250, 250);
        dealsImage.setVisible(true);

        ImageIcon fish = new ImageIcon(getClass().getResource("fish4.png"));
        fishImage = new JLabel();
        fishImage.setIcon(fish);
        fishImage.setBounds(470, 0, 250, 250);
        fishImage.setVisible(true);

        frame.add(Deals);
        frame.add(Fish);
        frame.add(Urban_Special);
        frame.add(Salads);
        frame.add(Vegetarian);
        frame.add(Desserts);
        frame.add(Cakes);
        frame.add(Drinks);
        frame.add(Back);
        frame.add(dessertsImage);
        frame.add(cakesImage);
        frame.add(specialImage);
        frame.add(saladsImage);
        frame.add(vegetarianImage);
        frame.add(drinksImage);
        frame.add(dealsImage);
        frame.add(fishImage);
        frame.add(MenuImage);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Deals) {
            new BuilderPattern();
        }
        if (e.getSource() == Fish) {
            AdapterPattern adapterPattern = new AdapterPattern();
            adapterPattern.initializeUI();

        }
        if (e.getSource() == Back) {
            frame.dispose();
            RestaurantManagementSystem Menu = new RestaurantManagementSystem();
        }
        if (e.getSource() == Urban_Special) {
            SwingUtilities.invokeLater(BridgePattern::new);
        }
        if (e.getSource() == Drinks) {
            new NullObjectPattern();
        }
        if (e.getSource() == Vegetarian) {
            new CompositePattern();
        }
        if (e.getSource() == Salads) {
            new CompositePattern1();
        }
        if (e.getSource() == Desserts) {
            new CompositePattern2();
        }
        if (e.getSource() == Cakes) {
            new CompositePattern3();
        }        
        

    }
}
