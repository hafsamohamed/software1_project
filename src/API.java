import controller.accountmanager.AccountController;
import controller.friendcontroller.FriendsController;
import system.systemusers.Account;
import system.user.User;

public class API {

    public static void main(String[] args) {
        AccountController accountController = new AccountController();
        FriendsController friendsController = new FriendsController();
        User user1 = new User();
       // User user2 = new User();

        accountController.createAccount(user1);
        //accountController.createAccount(user2);


        Account account = user1.login(accountController);
       // friendsController.sendFriendRequest(accountController.getAccounts(), account);
        //friendsController.acceptFriendRequest(accountntController.upgradeRegisteration(account);
        //System.out.println("========" + account.getUser().getType());

    }
}
