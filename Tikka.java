package restaurantmanagementsystem;

public abstract class Tikka implements Item {

    @Override
    public Packing packing() {
        return new Foil();
    }

    @Override
    public abstract float price();

}
