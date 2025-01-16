package restaurantmanagementsystem;

public class ZingerBurger extends Burger {

    @Override
    public float price() {
        return 550f;
    }

    @Override
    public String name() {
        return "Zinger Burger";
    }
}
