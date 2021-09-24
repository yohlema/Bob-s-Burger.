package com.company;

public class DeluxeHamBurger extends Hamburger {
    private boolean hasChips;
    private boolean hasDrinks;
    private int defaultDeluxeBurgerPrice = 14;
    


    public DeluxeHamBurger(String breadRollType, String meat) {
        super(breadRollType, meat, false, false, false, false);
    }


    @Override
    public void totalOrderPrice() {
        System.out.println("The price of your deluxe burger is " + defaultDeluxeBurgerPrice + " dollars." + "\n");
    }
}
