package restaurantmanagementsystem;

public class MultanBranch implements RestaurantBranch {

    @Override
    public String displayBranchInfo() {
        return "Location: 789 Mall Road, Gulgasht Colony, Multan"
                + " Contact: +92 3342357230"
                + " Opening Hours: 11:00 AM - 11:00 PM";
    }

}
