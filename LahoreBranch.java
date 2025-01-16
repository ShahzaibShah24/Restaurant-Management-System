package restaurantmanagementsystem;
public class LahoreBranch implements RestaurantBranch {

   @Override
   public String displayBranchInfo() {
            return "Location: 321 Liberty Market, Gulberg III, Lahore"
              + " Contact: +92 3102579632"
              + " Opening Hours: 11:00 AM - 11:00 PM";
   }
}



