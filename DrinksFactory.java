package restaurantmanagementsystem;
public class DrinksFactory {
     public static final String [] drinks = {"Pepsi","Dew","Mirinda","Sting","Water"};
     public static final int[] prices = {50,60,70,100,60};
     public static Drinks getDrink(String name){
         for(int i = 0; i< drinks.length; i++){
             if(drinks[i].equalsIgnoreCase(name)){
                 return new RealDrink(name.toUpperCase(),prices[i]);
             }
         }
         return new NullDrink(name.toUpperCase());
     }
}
