package org.example;

public class Account {

    private double totalValueOfTrades;

    public Account(double totalValueOfTrades) {
        this.totalValueOfTrades = totalValueOfTrades;
    }

    public double getTotalValueOfTrades() {
        return this.totalValueOfTrades;
    }

    public void setTotalValueOfTrades(double totalValueOfTrades) {
        this.totalValueOfTrades = totalValueOfTrades;
    }
}
