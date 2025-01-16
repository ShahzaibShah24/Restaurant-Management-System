package restaurantmanagementsystem;
public class KarachiBranch implements RestaurantBranch {

   @Override
   public String displayBranchInfo() {
            return "Location: 123 Main Street, Clifton, Karachi"
              + " Contact: +92 32102547896"
              + " Opening Hours: 12:00 PM - 03:00 AM";
   }
}