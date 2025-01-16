package restaurantmanagementsystem;
public class Customer {
    private String name,date;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }
    public Customer(String name,String date){
        this.name=name;
        this.date=date;
    }
    public void placeOrder(String order){
        Restaurantt.placeOrder(this,order);
    }
    
}
