package restaurantmanagementsystem;
public abstract class Restaurant {
    protected Chef chef;
    protected Restaurant(Chef chef){
        this.chef = chef;
    }
    public abstract void dish(String dishName);
    public abstract String getDishName();
}
