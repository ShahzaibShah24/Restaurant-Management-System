package restaurantmanagementsystem;
public abstract class Roll implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
