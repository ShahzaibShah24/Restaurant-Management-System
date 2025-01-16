package restaurantmanagementsystem;

public class TurkishKabab extends Kabab {

    @Override
    public float price() {
        return 600f;
    }

    @Override
    public String name() {
        return "Turkish Kabab";
    }
}
