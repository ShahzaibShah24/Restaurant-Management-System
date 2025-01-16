package restaurantmanagementsystem;

public abstract class Drinks {

    protected String name;
    protected int price;

    public abstract String getName();

    public abstract int getPrice();

    public abstract boolean isNil();

}
