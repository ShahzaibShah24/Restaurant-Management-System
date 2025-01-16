package restaurantmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderPage extends JFrame {

    private JTextField nameField;
    private JPanel itemsPanel;
    private JButton orderButton;
    private List<JCheckBox> checkBoxes;
    private List<FoodItem> foodItems;

    private static OrderPage instance = new OrderPage();

    private OrderPage() {
        setTitle("Order Page");
        setBounds(450, 10, 750, 800);
        setLayout(new BorderLayout());

        // Name field
        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.WHITE);
        nameField = new JTextField(20);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        namePanel.setBackground(Color.BLACK);

        // Items panel
        itemsPanel = new JPanel();
        itemsPanel.setLayout(new GridLayout(0, 4));

        checkBoxes = new ArrayList<>();
        foodItems = new ArrayList<>();
        addItems();

        JScrollPane scrollPane = new JScrollPane(itemsPanel);
        scrollPane.setBorder(null);

        // Order button
        JPanel buttonPanel = new JPanel();
        orderButton = new JButton("Order");
        orderButton.setBackground(new Color(201, 152, 38));
        orderButton.setForeground(Color.BLACK);
        orderButton.setFocusable(false);
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                showBill();

            }
        });
        buttonPanel.add(orderButton);
        buttonPanel.setBackground(Color.BLACK);

        add(namePanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static OrderPage getInstance() {
        return instance;
    }

    public void reset() {
        nameField.setText("");
        for (JCheckBox checkBox : checkBoxes) {
            checkBox.setSelected(false);
        }
    }

    private void addItems() {
        addItemCheckBox("Deal 1", 1310);
        addItemCheckBox("Deal 2", 2260);
        addItemCheckBox("Deal 3", 1460);
        addItemCheckBox("Deal 4", 1160);
        addItemCheckBox("Deal 5", 1560);
        addItemCheckBox("Deal 6", 1710);
        addItemCheckBox("Fried Fish Salmon", 500);
        addItemCheckBox("Grilled Fish Halibut", 700);
        addItemCheckBox("Grilled Fish Tuna", 450);
        addItemCheckBox("Baked Fish Mahi Mahi", 550);
        addItemCheckBox("Fried Fish Trout", 650);
        addItemCheckBox("Fish Curry Cod", 850);
        addItemCheckBox("Baked Fish Halibut", 950);
        addItemCheckBox("Grilled Fish Grouper", 1050);
        addItemCheckBox("Fish Curry Tilapia", 900);
        addItemCheckBox("Baked Fish Red Snapper", 900);
        addItemCheckBox("Fried Fish Sardines", 900);
        addItemCheckBox("Daal Makhni", 850);
        addItemCheckBox("Paneer Tikka Masala", 750);
        addItemCheckBox("Malai Kofta", 800);
        addItemCheckBox("Vegetable Pulao", 1000);
        addItemCheckBox("Chicken Handi", 1600);
        addItemCheckBox("Nihari", 700);
        addItemCheckBox("Chapli Kebab", 550);
        addItemCheckBox("Paya(Trotters)", 700);
        addItemCheckBox("Mushroom Soup", 450);
        addItemCheckBox("Caprese Panini", 550);
        addItemCheckBox("Falafel Wrap", 600);
        addItemCheckBox("Vegetable Biryani", 650);
        addItemCheckBox("Veggie Burger", 250);
        addItemCheckBox("Veggie Stir-Fry", 800);
        addItemCheckBox("Veg Sushi Roll", 450);
        addItemCheckBox("Veggie Fajitas", 750);
        addItemCheckBox("Vegetarian Curry", 750);
        addItemCheckBox("Lentil Curry", 900);
        addItemCheckBox("Caeser Salad", 1000);
        addItemCheckBox("Greek Salad", 1300);
        addItemCheckBox("Cobb Salad", 1450);
        addItemCheckBox("Waldorf Salad", 1650);
        addItemCheckBox("Caprese Salad", 1200);
        addItemCheckBox("Niçoise Salad", 950);
        addItemCheckBox("Quinoa Salad", 850);
        addItemCheckBox("Thai Papaya Salad", 900);
        addItemCheckBox("Broccoli Salad", 1150);
        addItemCheckBox("Spinach Salad", 1350);
        addItemCheckBox("Ice Cream Sundae", 550);
        addItemCheckBox("Fruit Tart", 900);
        addItemCheckBox("Crème Brûlée", 1100);
        addItemCheckBox("Tiramisu", 950);
        addItemCheckBox("Chocolate Mousse", 1250);
        addItemCheckBox("Rice Pudding", 750);
        addItemCheckBox("Chocolate Fondue", 650);
        addItemCheckBox("Apple Crumble", 1000);
        addItemCheckBox("Banana Split", 550);
        addItemCheckBox("Lemon Sorbet", 1350);
        addItemCheckBox("Red Velvet Cake", 1350);
        addItemCheckBox("Chocolate Fudge Cake", 1450);
        addItemCheckBox("Vanilla Buttercream Cake", 1550);
        addItemCheckBox("Carrot Cake", 1800);
        addItemCheckBox("Lemon Pound Cake", 2500);
        addItemCheckBox("Black Forest Cake", 1500);
        addItemCheckBox("Marble Cake", 1100);
        addItemCheckBox("Coconut Cream Cake", 1800);
        addItemCheckBox("Oreo Cheesecake", 1850);
    }

    private void addItemCheckBox(String itemName, double itemPrice) {
        JCheckBox checkBox = new JCheckBox(itemName);
        checkBox.setForeground(Color.BLACK);
        checkBox.setBackground(new Color(201, 152, 38));
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
        checkBoxes.add(checkBox);
        itemsPanel.add(checkBox);
        foodItems.add(new FoodItem(itemName, itemPrice));
    }

    private void showBill() {
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your name.");
            return;
        }

        List<FoodItem> selectedItems = new ArrayList<>();
        double totalAmount = 0;

        for (int i = 0; i < checkBoxes.size(); i++) {
            JCheckBox checkBox = checkBoxes.get(i);
            if (checkBox.isSelected()) {
                FoodItem foodItem = foodItems.get(i);
                selectedItems.add(foodItem);
                totalAmount += foodItem.getPrice();
            }
        }

        if (selectedItems.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select at least one item.");
            return;
        }
        int totalItems = selectedItems.size();
        double gstAmount = totalAmount * 0.13;
        double totalAmountWithGst = totalAmount + gstAmount;

        String orderNumber = generateOrderNumber();
        String currentDate = getCurrentDate();

        StringBuilder billBuilder = new StringBuilder();
        billBuilder.append("                 Urban Eat\n");
        billBuilder.append("-------------------------------------------------\n\n");
        billBuilder.append("Order Number: ").append(orderNumber).append("\n");
        billBuilder.append("Date: ").append(currentDate).append("\n");
        billBuilder.append("Customer Name: ").append(name).append("\n\n");
        billBuilder.append("Items:\n");

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (FoodItem foodItem : selectedItems) {
            billBuilder.append("Name: ").append(foodItem.getName()).append("\n");
            billBuilder.append("Price: Rs ").append(decimalFormat.format(foodItem.getPrice())).append("\n");
            billBuilder.append("-----------------------\n");
        }
        billBuilder.append("Total Items: ").append(totalItems).append("\n");
        billBuilder.append("Subtotal: Rs ").append(decimalFormat.format(totalAmount)).append("\n");
        billBuilder.append("GST (13%): Rs ").append(decimalFormat.format(gstAmount)).append("\n");
        billBuilder.append("Total Amount (incl. GST): Rs ").append(decimalFormat.format(totalAmountWithGst));

        JOptionPane.showMessageDialog(this, billBuilder.toString());
        reset();

    }

    private String generateOrderNumber() {
        int orderNumber = (int) (Math.random() * 1000000);
        return String.format("%06d", orderNumber);
    }

    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private class FoodItem {

        private String name;
        private double price;

        public FoodItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
