package restaurantmanagementsystem;
public class NonVegFood extends Restaurant{
    private String dishName;
    public  NonVegFood(Chef chef){
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
