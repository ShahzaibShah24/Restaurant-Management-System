package restaurantmanagementsystem;

public class FriedFishImpl implements Other_Restaurant {

    private AdapterPattern adapterPattern;
    @Override
    public void bakedFish(String dishType, String fishName) {
        //do nothing
    }

    @Override
    public void friedFish(String dishType, String fishName) {
        AdapterPattern adapterPattern = new AdapterPattern(); 
        adapterPattern.appendToTextArea(fishName);
    }
}
