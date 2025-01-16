package restaurantmanagementsystem;

public class OwnRestaurant implements Fish {

    DeliveryBoy deliveryBoy;
    AdapterPattern adapterPattern;

    public OwnRestaurant(AdapterPattern adapterPattern) {
        this.adapterPattern = adapterPattern;
    }

    @Override
    public void fishMenu(String dishType, String fishName) {
        if (dishType.equalsIgnoreCase("Fish Curry")) {
            adapterPattern.appendToTextArea("         Fish Curry " + fishName + "\n");
        } else if (dishType.equalsIgnoreCase("Grilled Fish")) {
            adapterPattern.appendToTextArea("         Grilled Fish " + fishName + "\n");
        } else if (dishType.equalsIgnoreCase("Baked Fish")) {
            deliveryBoy = new DeliveryBoy(dishType);
            deliveryBoy.fishMenu(dishType, fishName);
            adapterPattern.appendToTextArea("         Baked Fish " + fishName + "\n");

        } else if (dishType.equalsIgnoreCase("Fried Fish")) {
            deliveryBoy = new DeliveryBoy(dishType);
            deliveryBoy.fishMenu(dishType, fishName);
            adapterPattern.appendToTextArea("         Fried Fish " + fishName + "\n");
        }
    }
}
