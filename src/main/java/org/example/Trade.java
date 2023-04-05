package org.example;

import java.time.LocalDateTime;

public abstract class Trade {
    private String ID;
    private String symbol;
    private int quantity;
    private int price;
    private double dividend;
    private LocalDateTime timeCreated;


    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.timeCreated = LocalDateTime.now();
    }

    public Trade(String ID, String symbol, int quantity, int price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.timeCreated = LocalDateTime.now();
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }


    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public abstract double calcDividend();




}
