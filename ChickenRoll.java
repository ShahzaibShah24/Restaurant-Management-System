package restaurantmanagementsystem;

public class ChickenRoll extends Roll {

    @Override
    public float price() {
        return 250f;
    }

    @Override
    public String name() {
        return "Chicken Roll";
    }
}
