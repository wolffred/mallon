package org.example;

public class Trader {
    private String name;
    private Account account;

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void addTrade(Trade trade){
        double newTradeTotal =  this.account.getTotalValueOfTrades() + (trade.getPrice() * trade.getQuantity());
        this.account.setTotalValueOfTrades(newTradeTotal);

    }
}
