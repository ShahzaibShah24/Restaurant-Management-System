package restaurantmanagementsystem;
public class SeLLItems implements Inventory{
    private final Kitchen Item;
    public SeLLItems(Kitchen Item){
        this.Item = Item;
    }

    @Override
    public void placeorder() {
        Item.sellItems();
    }
}
