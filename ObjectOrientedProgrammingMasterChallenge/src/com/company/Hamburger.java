package com.company;

public class Hamburger {
    private String BreadRollType;
    private String meat;
    private boolean hasTomato;
    private boolean hasOnions;
    private boolean hasCarrots;
    private boolean hasAvocado;
    private int defaultPrice;


    public Hamburger(String breadRollType, String meat, boolean hasTomato, boolean hasOnions, boolean hasCarrots, boolean hasAvocado) {
        BreadRollType = breadRollType;
        this.meat = meat;
        this.hasTomato = hasTomato;
        this.hasOnions = hasOnions;
        this.hasCarrots = hasCarrots;
        this.hasAvocado = hasAvocado;

    }

    public String getBreadRollType() {
        return BreadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public boolean isHasAddition1() {
        return hasTomato;
    }

    public boolean HasAddition2() {
        return hasOnions;
    }

    public boolean HasAddition3() {
        return hasCarrots;
    }

    public boolean HasAddition4() {
        return hasAvocado;
    }
    private int calculatePrice(){
        defaultPrice = 10;
        if(hasTomato){
            defaultPrice += 2;
        }
        if(hasOnions){
            defaultPrice += 2;
        }if(hasCarrots){
            defaultPrice += 2;
        }
        if(hasAvocado){
            defaultPrice += 2;
        }
return defaultPrice;
        
    }
    public int showPrice(){
        return calculatePrice();
    }
    public void totalOrderPrice(){
        System.out.println("The price of the burger you ate is " + showPrice() + " dollars." + "\n");
    }
            
}
