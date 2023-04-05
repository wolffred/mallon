package org.example;

public class BondTrade extends Trade{
    public BondTrade(String ID, String symbol, int quantity, double dividend) {
        super(ID, symbol, quantity);
        super.setDividend(dividend);
    }

    public BondTrade(String ID, String symbol, int quantity, int price, double dividend) {
        super(ID, symbol, quantity, price);
        super.setDividend(dividend);
    }

    @Override
    public double calcDividend() {
        return this.getDividend();
    }




    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + super.getID() + '\'' +
                ", symbol='" + super.getSymbol() + '\'' +
                ", quantity=" + super.getQuantity() +
                ", price=" + super.getPrice() +
                ", dividend" + super.getDividend() +
                '}';
    }







}
