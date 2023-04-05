package org.example;

import java.time.LocalDate;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType member;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.member = member;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public MembershipType getMember() {
        return member;
    }

    public void setMember(MembershipType member) {
        this.member = member;
    }



    public void addTrade(Trade trade) {
       // if (this.canTrade()) {
            this.dailyTradeNumber += 1;
            this.dailyTradeValue += trade.getTradeValue();
            this.addPoints();
//        } else {
//            System.out.println("Client unable to add " + trade);
//        }
    }

    public boolean canTrade() {
        if (!LocalDate.now().equals(dateOfLastTrade)) {
            this.resetDailyTradeInformation();
        }
        if (membership != null) {
            return membership.canTrade(dailyTradeNumber, dailyTradeValue, maximumDailyTradeValue);
        } else {
            return true;
        }
    }


}
