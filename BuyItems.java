package restaurantmanagementsystem;

public class BuyItems implements Inventory {

    private final Kitchen Item;

    public BuyItems(Kitchen Item) {
        this.Item = Item;
    }

    @Override
    public void placeorder() {
        Item.buyItems();
    }
}
