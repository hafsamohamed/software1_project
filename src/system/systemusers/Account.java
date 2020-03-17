package system.systemusers;


import controller.accountmanager.AccountController;
import system.chats.Message;
import system.friend.Friend;
import system.interaction.Post;
import system.media.Group;
import system.media.Page;
import system.user.User;

import java.util.Vector;

public class Account {
    private String userName;
    private String password;

    private User user;
    private Vector<Post> posts ;
    private Vector<Page> pages ;
    private Vector<Group> groups ;
    private Vector<Message> messages ;
    private Vector<Friend> friends = new Vector<Friend>() ;
    private Vector<Friend> friendRequests = new Vector<Friend>() ;

    private AccountController controller;

    public Account(){}

    public void setUser(User user) {
        this.user = user;
    }

    public void addFriendd(Friend fr){
        friends.add(fr);
    }
    public void addFriendRequest(Friend fr){
        friendRequests.add(fr);
    }

    public Vector<Friend> getFriendRequests() {
        return friendRequests;
    }

    public Vector<Friend> getFriends() {
        return friends;
    }

    public User getUser() {
        return user;
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean logout(Account account){
        return true;
    }
}
