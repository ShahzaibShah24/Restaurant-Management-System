package restaurantmanagementsystem;

public abstract class Kabab implements Item {

    @Override
    public Packing packing() {
        return new Foil();
    }

    @Override
    public abstract float price();

}
