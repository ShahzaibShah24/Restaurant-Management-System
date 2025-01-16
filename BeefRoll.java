package restaurantmanagementsystem;

public class BeefRoll extends Roll {

    @Override
    public float price() {
        return 200f;
    }

    @Override
    public String name() {
        return "Beef Roll";
    }
}
