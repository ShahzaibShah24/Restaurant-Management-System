package restaurantmanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class Cakes {
    private final String name ;
    private final int price;
    List<Cakes> foodItems;
    
    public Cakes(String name,int price){
        this.name = name;
        this.price=price;
        foodItems = new ArrayList<>();
    }
    public void add (Cakes c){
        foodItems.add(c);
    }
    public List<Cakes> getfoodItems(){
        return foodItems;
    }
    @Override
    public String toString(){
        return ("Cake Name ---> "+name+" ---> Price: "+ price);
    }
}

