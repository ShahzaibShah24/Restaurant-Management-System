package restaurantmanagementsystem;

public class CheesBurstPizza extends Pizza {

    @Override
    public float price() {
        return 800f;
    }

    @Override
    public String name() {
        return "Cheese Burst Pizza";
    }
}
