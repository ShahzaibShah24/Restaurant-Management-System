package restaurantmanagementsystem;
public class NullDrink extends Drinks{
    public NullDrink(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name + " Not Available";
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
