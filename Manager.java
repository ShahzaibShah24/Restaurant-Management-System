package restaurantmanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class Manager {
    private List<Inventory> FoodList = new ArrayList<Inventory>(); 
   public void takeOrder(Inventory order){
      FoodList.add(order);		
   }
   public void placeOrders(){
      for (Inventory order : FoodList) {
         order.placeorder();
      }
      FoodList.clear();
   }
}


