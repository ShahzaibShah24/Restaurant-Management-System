package restaurantmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Salads {
    private final String name ;
    private final int price;
    List<Salads> foodItems;
    
    public Salads(String name,int price){
        this.name = name;
        this.price=price;
        foodItems = new ArrayList<>();
    }
    public void add (Salads s){
        foodItems.add(s);
    }
    public List<Salads> getfoodItems(){
        return foodItems;
    }
    @Override
    public String toString(){
        return ("Salad Name : "+name+" ---> Price: "+ price);
    }
}
