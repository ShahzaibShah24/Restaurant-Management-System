package restaurantmanagementsystem;

public class PepperoniPizza extends Pizza {

    @Override
    public float price() {
        return 1050f;
    }

    @Override
    public String name() {
        return "Pepperoni Pizza";
    }
}
