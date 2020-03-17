package controller.friendcontroller;

import system.friend.Friend;
import system.systemusers.Account;

import java.util.Scanner;
import java.util.Vector;

public class FriendsController {
    private Account account;
    private Friend friend;
    private Vector<Friend> friends = new Vector<Friend>() ;


    public FriendsController(){}

    public boolean sendFriendRequest(Vector<Account>accounts, Account acc){
        Friend f = new Friend();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the friend you want to add: ");
        String name = in.nextLine();
                boolean flag = false;

                for(int i=0; i<accounts.size(); i++) {
                    //System.out.println("pppppppppppppp" + );
                    if (name.equals(accounts.get(i).getUser().getUserName())) {
                        System.out.println("friend--->" + (i) + " " + "friend name: " + accounts.get(i).getUser().getUserName() + " " + "friend mail: " + accounts.get(i).getUser().getMail());
                        flag = true;
                        f.setAccount(accounts.get(i));
                        f.setName(name);
                        break;

                    }
                }

          if(flag == false){
              System.out.println("This name does not exist...");
          }
          else{
              acc.addFriendRequest(f);
              System.out.println("Friend request has sent successfully!!!!!");
          }
        return false;

    }
    public boolean removeFriend(Friend friend){
        return true;
    }
    public boolean acceptFriendRequest(Vector<Friend>friendRequests){
        for(int i=0; i<friendRequests.size(); i++) {
            System.out.println("friend requests: " + i +  friendRequests.get(i).getName());
        }
        System.out.println("Enter the name of friend you want to accept");
        Scanner n = new Scanner(System.in);
        String nam = n.nextLine();
        Friend f = new Friend();
        for(int i=0; i<friendRequests.size(); i++) {
            if(nam.equals(friendRequests.get(i).getName())){
                f.setAccount(friendRequests.get(i).getAccount());
                f.setName(nam);
                friends.add(f);
                System.out.println("You and" + " " + nam + " " + "are now friends");
                return true;
            }
            return false;
        }
        return false;

    }



}
