package com.ltts.Shopping.Cart.Entity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Basket {

//    private List<Items> items;

    private HashMap<Items,Integer> basket;

    public Basket() {
//        this.items=new ArrayList<Items>();
        this.basket=new HashMap<>();
    }

    public HashMap<Items, Integer> getBasket() {
        return basket;
    }
}