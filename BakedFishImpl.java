package restaurantmanagementsystem;

public class BakedFishImpl implements Other_Restaurant {

    @Override
    public void bakedFish(String dishType, String fishName) {
        AdapterPattern adapterPattern = new AdapterPattern(); 
        adapterPattern.appendToTextArea(fishName);
    }

    @Override
    public void friedFish(String dishType, String fishName) {
        //do nothing
    }
}