package restaurantmanagementsystem;

public class DeliveryBoy implements Fish {

    private Other_Restaurant otherRestaurant;
    private AdapterPattern adapterPattern;

    public DeliveryBoy(String dishType) {
        if (dishType.equalsIgnoreCase("Baked Fish")) {
            otherRestaurant = new BakedFishImpl();
        } else if (dishType.equalsIgnoreCase("Fried Fish")) {
            otherRestaurant = new FriedFishImpl();
        }
    }

    @Override
    public void fishMenu(String dishType, String fishName) {
        if (dishType.equalsIgnoreCase("Baked Fish")) {
            otherRestaurant.bakedFish(dishType, fishName);
        } else if (dishType.equalsIgnoreCase("Fried Fish")) {
            otherRestaurant.friedFish(dishType, fishName);
        }
    }
}
