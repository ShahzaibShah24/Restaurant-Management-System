package restaurantmanagementsystem;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SingletonPattern {

    // Create an object of SingleObject
    private static final SingletonPattern instance = new SingletonPattern();

    // Make the constructor private so that this class cannot be instantiated
    private SingletonPattern() {
    }

    // Get the only object available
    public static SingletonPattern getInstance() {
        return instance;
    }

    // Example method to display employee information
    public void displayEmployeeInfo() {
        // Create a list of employee information
        List<String> employeeInfoList = new ArrayList<>();
        employeeInfoList.add("Ahmed Khan, ahmed@gmail.com, 2017-01-01, Manager");
        employeeInfoList.add("Muhammad Ali, ali@gmail.com, 2017-02-15, Cashier      ");
        employeeInfoList.add("Hassan Raza, hasan@gmail.com, 2017-03-10, Waiter     ");
        employeeInfoList.add("Usman Ahmed, usman@gmail.com, 2017-04-20, Chef     ");
        employeeInfoList.add("Fahad Malik, fahad@gmail.com, 2019-05-05, Waiter        ");
        employeeInfoList.add("Fatima Ali, fatima@gmail.com, 2018-06-30, Receptionist");
        employeeInfoList.add("Asad Khan, asad@gmail.com, 2019-07-15, Waiter             ");
        employeeInfoList.add("Ali Raza, aliraza@gmail.com, 2018-08-25, Chef                 ");
        employeeInfoList.add("Junaid Ahmed, junaid@gmail.com, 2019-05-05, Chef        ");
        employeeInfoList.add("Saad Mehmood, saad@gmail.com, 2019-08-25, Waiter     ");

        // Create a JFrame to display the employee information
        JFrame frame = new JFrame("Employees Information");
        frame.setBounds(400, 300, 680, 260);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold the labels
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        // Create a label for each employee and add it to the panel
        for (String employeeInfo : employeeInfoList) {
            String[] infoArray = employeeInfo.split(", ");
            JLabel label = new JLabel("Name: " + infoArray[0]
                    + "  |  Email: " + infoArray[1]
                    + "  |  Date of Joining: " + infoArray[2]
                    + "  | Designation: " + infoArray[3]);
            label.setForeground(Color.WHITE);
            panel.add(label);
            
        }

        // Add the panel to the frame and make it visible
        frame.add(panel);
        frame.setVisible(true);
    }
}
