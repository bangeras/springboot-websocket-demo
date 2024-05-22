package com.svb.springbootwebsocketdemo.model;

import java.text.DecimalFormat;

public class StockPrice {


    private String symbolOnePrice;
    private String symbolTwoPrice;

    public String getSymbolOnePrice() {
        return getPrice();
    }

    public String getSymbolTwoPrice() {
        return getPrice();
    }


    private String getPrice(){
        DecimalFormat df2 = new DecimalFormat("####.##");
        return df2.format(Math.random()*10000);
    }


}
