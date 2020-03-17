package system.friend;

import controller.friendcontroller.FriendsController;
import system.systemusers.Account;

public class Friend {
    String name;
    Account account;
    FriendsController friendsController;

    public Account getAccount() {
        return account;
    }


    public Friend(){}

    public String getName() {
        return name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }
}
