package restaurantmanagementsystem;

import javax.swing.JTextArea;

public class Kitchen {

    private final String item1 = "Chicken";
    private final String item2 = "Beef";
    private final String item3 = "Mutton";
    private final String item4 = "Tomatoes";
    private final String item5 = "Potatoes";
    private final String item6 = "Eggs";
    private final String item7 = "Spices";
    private final String item8 = "Bread";
    private final String item9 = "Spices";
    private final String item10 = "Flour";

    private final int quantity1 = 8;
    private final int quantity2 = 15;
    private final int quantity3 = 13;
    private final int quantity4 = 12;
    private final int quantity5 = 14;
    private final int quantity6 = 20;
    private final int quantity7 = 10;
    private final int quantity8 = 9;
    private final int quantity9 = 6;
    private final int quantity10 = 24;    

    private JTextArea outputTextArea; // Text area to display output

    public void setOutputTextArea(JTextArea outputTextArea) {
        this.outputTextArea = outputTextArea;
    }

    public void buyItems() {
        outputTextArea.append("\t----------List of Item Bought-----------\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item4 + " Quantity: " + quantity4 + " ] bought\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item5 + " Quantity: " + quantity5 + " ] bought\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item6 + " Quantity: " + quantity6 + " ] bought\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item9 + " Quantity: " + quantity9 + " ] bought\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item10 + " Quantity: " + quantity10 + " ] bought\n\n");
    }

    public void sellItems() {
        outputTextArea.append("\t----------List of Item Sold-----------\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item1 + " Quantity: " + quantity1 + " ] sold\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item2 + " Quantity: " + quantity2 + " ] sold\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item3 + " Quantity: " + quantity3 + " ] sold\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item7 + " Quantity: " + quantity7 + " ] sold\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item8 + " Quantity: " + quantity8 + " ] sold\n\n");
    }
}
