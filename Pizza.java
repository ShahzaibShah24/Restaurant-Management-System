package restaurantmanagementsystem;

public abstract class Pizza implements Item {

    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public abstract float price();

}
