package restaurantmanagementsystem;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 350f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
