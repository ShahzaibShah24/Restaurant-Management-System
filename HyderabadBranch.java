package restaurantmanagementsystem;

public class HyderabadBranch implements RestaurantBranch {

    @Override
    public String displayBranchInfo() {
        return "Location: 987 Auto Bahn Road, Latifabad, Hyderabad"
                + " Contact: +92 3356441235"
                + " Opening Hours: 10:00 AM - 10:00 PM";
    }

}
