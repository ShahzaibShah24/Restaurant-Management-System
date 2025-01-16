package restaurantmanagementsystem;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 60f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
