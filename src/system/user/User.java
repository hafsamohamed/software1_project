package system.user;
import controller.accountmanager.AccountController;
import system.systemusers.Account;

import java.sql.Date;
import java.util.Scanner;

public class User {

    public enum Gender { male, female }
    private enum UserType { normal, premium }

    private String fame;
    private String lame;
    private String userName;
    private String password;
    private String mail;
    private Gender gender;
    private Date birthDate;
    private UserType type;
    private int age;
    private AccountController accountController = new AccountController();

    public User(){
        UserType userType = UserType.valueOf("normal");
    }

    public UserType changeType(){
        type = UserType.valueOf("premium");
        return type;
    }

    public String getFame() {

        return fame;
    }

    public void getData(){
        Scanner in = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f = in.nextLine();
        setFame(f);
        System.out.println("Enter your last name: ");
        String l = in.nextLine();
        setLame(l);
        System.out.println("Enter your mail: ");
        String m = in.nextLine();
        setMail(m);
        System.out.println("Enter your gender: ");
        Gender g = Gender.valueOf(n.next());
        setGender(g);
        System.out.println("Enter your age: ");
        int a = n.nextInt();
        setAge(a);
        System.out.println("Enter your user name: ");
        String u = in.nextLine();
        setUserName(u);
        System.out.println("Enter your password: ");
        String p  = in.nextLine();
        setPassword(p);
    }
    public void setFame(String name) {

        fame = name;
    }

    public String getLame()
    {
        return lame;
    }

    public void setLame(String name) {

        this.lame = name;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {

        this.mail = mail;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account login(AccountController accountC){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your user name: ");
        String userName = in.nextLine();
        System.out.println("Please enter your password: ");
        String password = in.nextLine();
        if((accountC.searchAccount(userName, password ))!= null ){
            System.out.println("Your login process has done successfully!!!");
            return accountC.searchAccount(userName, password );
        }
        else {
            System.out.println("This account does no4t exist. Create account: ");
            accountC.createAccount(this);
        }
        return null;




   }
}
