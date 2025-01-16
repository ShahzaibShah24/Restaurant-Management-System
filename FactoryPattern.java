package restaurantmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FactoryPattern {

    FactoryPattern() {
        //Factory Pattern
        RestaurantBranchFactory branchFactory = new RestaurantBranchFactory();

        // Get an object of Branch1
        RestaurantBranch branch1 = branchFactory.getBranch("LAHORE");
        String lahoreInfo = branch1.displayBranchInfo();

        // Get an object of Branch2
        RestaurantBranch branch2 = branchFactory.getBranch("KARACHI");
        String karachiInfo = branch2.displayBranchInfo();

        // Get an object of Branch3
        RestaurantBranch branch3 = branchFactory.getBranch("ISLAMABAD");
        String islamabadInfo = branch3.displayBranchInfo();
        
        // Get an object of Branch4
        RestaurantBranch branch4 = branchFactory.getBranch("MULTAN");
        String multanInfo = branch4.displayBranchInfo();
        
        // Get an object of Branch5
        RestaurantBranch branch5 = branchFactory.getBranch("HYDERABAD");
        String hyderabadInfo = branch5.displayBranchInfo();
        
        // Create a JFrame to display the branch information
        JFrame frame1 = new JFrame("Restaurant Branch Information");
        frame1.setBounds(400, 300, 680, 260);

        // Create a JPanel to hold the labels
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        // Create a label for Lahore branch information
        JLabel lahoreLabel = new JLabel("Lahore Branch Information:");
        lahoreLabel.setForeground(Color.WHITE);
        lahoreLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(lahoreLabel);

        JLabel lahoreInfoLabel = new JLabel(lahoreInfo);
        lahoreInfoLabel.setForeground(Color.CYAN);
        lahoreInfoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(lahoreInfoLabel);

        // Create a label for Karachi branch information
        JLabel karachiLabel = new JLabel("Karachi Branch Information:");
        karachiLabel.setForeground(Color.WHITE);
        karachiLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(karachiLabel);

        JLabel karachiInfoLabel = new JLabel(karachiInfo);
        karachiInfoLabel.setForeground(Color.CYAN);
        karachiInfoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(karachiInfoLabel);

        // Create a label for Islamabad branch information
        JLabel islamabadLabel = new JLabel("Islamabad Branch Information:");
        islamabadLabel.setForeground(Color.WHITE);
        islamabadLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(islamabadLabel);

        JLabel islamabadInfoLabel = new JLabel(islamabadInfo);
        islamabadInfoLabel.setForeground(Color.CYAN);
        islamabadInfoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(islamabadInfoLabel);

        // Create a label for Islamabad branch information
        JLabel multanLabel = new JLabel("Multan Branch Information:");
        multanLabel.setForeground(Color.WHITE);
        multanLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(multanLabel);

        JLabel multanInfoLabel = new JLabel(multanInfo);
        multanInfoLabel.setForeground(Color.CYAN);
        multanInfoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(multanInfoLabel);

        // Create a label for Islamabad branch information
        JLabel hyderabadLabel = new JLabel("Hyderabad Branch Information:");
        hyderabadLabel.setForeground(Color.WHITE);
        hyderabadLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(hyderabadLabel);

        JLabel hyderabadInfoLabel = new JLabel(hyderabadInfo);
        hyderabadInfoLabel.setForeground(Color.CYAN);
        hyderabadInfoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(hyderabadInfoLabel);

        // Add the panel to the frame
        frame1.add(panel);

        // Set the frame initially invisible
        frame1.setVisible(true);

    }
}
