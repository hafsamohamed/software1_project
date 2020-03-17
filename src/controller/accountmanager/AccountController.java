package controller.accountmanager;

import system.systemusers.Account;
import system.user.User;
import java.sql.Date;
import java.util.Scanner;
import java.util.Vector;

public class AccountController {
    private User user;
    private Vector<Account> accounts = new Vector<Account>() ;


    public AccountController(){}

    public Vector<Account> getAccounts() {
        return accounts;
    }
    public Account searchAccount(String userName, String password){
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).getUser().getUserName().equals(userName)){

                if(accounts.get(i).getUser().getPassword().equals(password))
                    return accounts.get(i);
                else
                    return null;

            }
            else
                return null;
        }
        return null;
    }

    public boolean createAccount(User data){
        data.getData();
        Account account = new Account();
        account.setUser(data);
        accounts.add(account);

        System.out.println("Your Account has created successfully ");
        System.out.println("Your Account has has user name: " + account.getUser().getUserName());
        return true;
    }

    public String getUserName(){
        return getUserName();
    }

    public String getPassword(){
        return user.getPassword();
    }

    public String getEmail(){
        return user.getMail();
    }

    public User.Gender getgender(){
        return this.user.getGender();
    }

    public Date getBirthDate(){
        return this.user.getBirthDate();
    }

    public boolean upgradeRegisteration(Account account){
        System.out.println("you should pay 99$ for a year to be a premium");
        System.out.println("yes or no?");
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        if(choice.equals( "yes")){
            System.out.println("Do you want to pay via credit card or PayPal?");
            String c = s.nextLine();
            if(c.equals("credit")){
                System.out.println("Enter credit password");
                String pass = s.nextLine();
                System.out.println("payment has done ");
                System.out.println("you are now a premium user");
                account.getUser().changeType();
                System.out.println("==" + account.getUser().getType());
            }
            else {
                System.out.println("Enter your PayPal account ");
                System.out.println("pay 99$ for a year ");
                System.out.println("payment has done ");
                System.out.println("you are now a premium user");
                account.getUser().changeType();
                System.out.println("==" + account.getUser().getType());
                //account.getUser().setType();
            }
        }
        else{
            System.out.println("you don't be able to be premium");
        }
        return true;
    }

}
