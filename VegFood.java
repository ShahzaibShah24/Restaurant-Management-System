package restaurantmanagementsystem;
public class VegFood extends Restaurant{
    private String dishName;
    public VegFood(Chef chef){
        super(chef);
    }

    @Override
    public void dish(String dishName) {
        chef.prepareDish(dishName);
        this.dishName=dishName;
    }

    @Override
    public String getDishName() {
        return dishName;
    }
    
}
