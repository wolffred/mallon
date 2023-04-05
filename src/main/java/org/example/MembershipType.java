package org.example;

public abstract class MembershipType {

    public static MembershipType assignMembership(int points) {
        if (points > 0 && points < 11) {
            return new Bronze();
        } else if (points > 10 && points < 21) {
            return new Silver();
        } else {
            return new Gold();
        }
    }
}
