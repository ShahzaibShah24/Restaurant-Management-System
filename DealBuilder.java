package restaurantmanagementsystem;

public class DealBuilder {

    public Deal prepareDeal1() {
        Deal deal = new Deal();
        deal.addItem(new ChickenBurger());
        deal.addItem(new ChickenRoll());
        deal.addItem(new ChickenMalaiTikka());
        deal.addItem(new Pepsi());
        return deal;
    }

    public Deal prepareDeal2() {
        Deal deal = new Deal();
        deal.addItem(new ZingerBurger());
        deal.addItem(new PepperoniPizza());
        deal.addItem(new TurkishKabab());
        deal.addItem(new Mirinda());
        return deal;
    }

    public Deal prepareDeal3() {
        Deal deal = new Deal();
        deal.addItem(new BeefRoll());
        deal.addItem(new CheesBurstPizza());
        deal.addItem(new SeekhKabab());
        deal.addItem(new Dew());
        return deal;
    }

    public Deal prepareDeal4() {
        Deal deal = new Deal();
        deal.addItem(new ZingerBurger());
        deal.addItem(new ChickenSpicyTikka());
        deal.addItem(new Sting());
        return deal;
    }

    public Deal prepareDeal5() {
        Deal deal = new Deal();
        deal.addItem(new ChickenRoll());
        deal.addItem(new ChickenMalaiTikka());
        deal.addItem(new TurkishKabab());
        deal.addItem(new Mirinda());
        return deal;
    }

    public Deal prepareDeal6() {
        Deal deal = new Deal();
        deal.addItem(new SeekhKabab());
        deal.addItem(new PepperoniPizza());
        deal.addItem(new BeefRoll());
        deal.addItem(new Pepsi());
        return deal;
    }
}
