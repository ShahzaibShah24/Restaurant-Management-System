package restaurantmanagementsystem;
public class RestaurantBranchFactory {
   public RestaurantBranch getBranch(String branchType){
      if(branchType == null){
         return null;
      }		
      if(branchType.equalsIgnoreCase("LAHORE")){
         return new LahoreBranch();
      } else if(branchType.equalsIgnoreCase("KARACHI")){
         return new KarachiBranch();
      } else if(branchType.equalsIgnoreCase("ISLAMABAD")){
         return new IslamabadBranch();
      }  else if(branchType.equalsIgnoreCase("MULTAN")){
         return new MultanBranch();
      } else if(branchType.equalsIgnoreCase("HYDERABAD")){
         return new HyderabadBranch();
      }
      return null;
   }
}
