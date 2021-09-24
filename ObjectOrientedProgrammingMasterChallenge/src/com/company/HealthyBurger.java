package com.company;

public class HealthyBurger extends Hamburger {
    private boolean hasBeans;
    private boolean hasGreens;
    private int defaultHealthyBurgerPrice = showPrice();




    public HealthyBurger(String meat, boolean hasTomato, boolean hasOnions, boolean hasCarrots, boolean hasAvocado, boolean hasBeans, boolean hasGreens) {
        super("Brown Rye", meat, hasTomato, hasOnions, hasCarrots, hasAvocado);
        this.hasBeans = hasBeans;
        this.hasGreens = hasGreens;
    }
    private int calculateHealthyBurgerPrice(){

        if(hasBeans) {
            defaultHealthyBurgerPrice += 2;
            if(hasGreens){
                defaultHealthyBurgerPrice +=2;
            }
            return defaultHealthyBurgerPrice;
        }
        return defaultHealthyBurgerPrice;

    }

    @Override
    public void totalOrderPrice() {
        System.out.println("The price of the Healthy Burger you ate is " + calculateHealthyBurgerPrice() + " dollars" + "\n");
    }
}
