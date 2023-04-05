package org.example;

public class FundTrade extends Trade{
    private double dividendRate;
    public FundTrade(String ID, String symbol, int quantity, double dividend, double dividendRate) {
        super(ID, symbol, quantity);
        super.setDividend(dividend);
        this.dividendRate = dividendRate;
    }

    public FundTrade(String ID, String symbol, int quantity, int price, double dividend) {
        super(ID, symbol, quantity, price);
        super.setDividend(dividend);
        this.dividendRate = dividendRate;
    }



    @Override
    public double calcDividend() {
        return this.dividendRate * this.getPrice();
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
