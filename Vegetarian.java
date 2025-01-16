package restaurantmanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class Vegetarian {
    private final String name ;
    private final int price;
    List<Vegetarian> foodItems;
    
    public Vegetarian(String name,int price){
        this.name = name;
        this.price=price;
        foodItems = new ArrayList<>();
    }
    public void add (Vegetarian m){
        foodItems.add(m);
    }
    public List<Vegetarian> getfoodItems(){
        return foodItems;
    }
    @Override
    public String toString(){
        return ("Food Item:[ Name : "+name+" | Price: "+ price+" ]");
    }
}
