package restaurantmanagementsystem;

public class IslamabadBranch implements RestaurantBranch {

   @Override
   public String displayBranchInfo() {
            return "Location: 456 Park Avenue, F-7 Markaz, Islamabad"
              + " Contact: +92 3456879545"
              + " Opening Hours: 08:00 AM - 09:00 PM";
   }
}
