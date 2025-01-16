package restaurantmanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class Deal {
   private List<Item> items = new ArrayList<>();

   public void addItem(Item item) {
      items.add(item);
   }

   public float getCost() {
      float cost = 0.0f;

      for (Item item : items) {
         cost += item.price();
      }
      return cost;
   }

   public String showItems() {
      StringBuilder sb = new StringBuilder();

      for (Item item : items) {
         sb.append("Item : " + item.name());
         sb.append(", Packing : " + item.packing().pack());
         sb.append(", Price : " + item.price());
         sb.append("\n");
      }
      
      return sb.toString();
   }
}
