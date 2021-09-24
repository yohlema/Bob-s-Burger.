package com.company;

public class Main {

    public static void main(String[] args) {
    HealthyBurger healthyBurger = new HealthyBurger("Medium Rare", true,true,false,true,true,true);
    healthyBurger.totalOrderPrice();


    Hamburger hamburger = new Hamburger("Wheat","Well done",true,false,true,true);
    hamburger.totalOrderPrice();

    DeluxeHamBurger deluxeHamBurger = new DeluxeHamBurger("Italian bread","Medium rare");
    deluxeHamBurger.totalOrderPrice();


    HealthyBurger healthyBurger1 = new HealthyBurger("Well done",false,false, false,false,false,false);
    healthyBurger1.totalOrderPrice();

    HealthyBurger ayda = new HealthyBurger("Medium Rare",true,true,false,false,false,false) ;
    ayda.totalOrderPrice();




    }
}
