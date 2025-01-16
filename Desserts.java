package restaurantmanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class Desserts {
    private final String name ;
    private final int price;
    List<Desserts> foodItems;
    
    public Desserts(String name,int price){
        this.name = name;
        this.price=price;
        foodItems = new ArrayList<>();
    }
    public void add (Desserts d){
        foodItems.add(d);
    }
    public List<Desserts> getfoodItems(){
        return foodItems;
    }
    @Override
    public String toString(){
        return ("Dessert Name -- -- "+name+" -- -- Price: "+ price);
    }
}

