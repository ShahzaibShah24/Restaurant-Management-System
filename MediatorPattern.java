package restaurantmanagementsystem;

import javax.swing.*;

public class MediatorPattern {

    public MediatorPattern() {
        
        //Restaurantt.createAndShowGUI();
        Customer customer1 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer2 = new Customer("Ahsan Khan", "Tuesday, 30 May 2023");
        Customer customer3 = new Customer("Zakir Hussain", "Saturday, 27 May 2023");
        Customer customer4 = new Customer("Asghar Shahmeer", "Friday, 26 May 2023");
        Customer customer5 = new Customer("Yasmin Qadir", "Wednesday, 24 May 2023");
        Customer customer6 = new Customer("Shafa Qadir", "Monday, 22 May 2023");
        Customer customer7 = new Customer("Imran Khan", "Tuesday, 16 May 2023");
        Customer customer8 = new Customer("Yaqoob Ismail", "Monday, 15 May 2023");
        Customer customer9 = new Customer("Ifrah Shoaib", "Sunday, 14 May 2023");
        Customer customer10 = new Customer("Nadeem Naniwala", "Saturday, 13 May 2023");

        customer1.placeOrder("Daal Makhni");
        customer2.placeOrder("Paneer Tikka Masala");
        customer3.placeOrder("Malai Kofta");
        customer4.placeOrder("Nihari");
        customer5.placeOrder("Chicken Malai Tikka");
        customer6.placeOrder("Pepperoni Pizza");
        customer7.placeOrder("Beef Roll");
        customer8.placeOrder("Turkish Kabab");
        customer9.placeOrder("Zinger Burger");
        customer10.placeOrder("Chicken Roll");
    }

    }